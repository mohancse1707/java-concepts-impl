package com.mohan.codeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexiconHelper {
	
	// maintaining unique word list to generate neighbors
	private static LinkedList<String> uniqueWords = new LinkedList<String>();

	public static LinkedList<WordInfoObject> buildLexicon(String filePath, String inputFile){
		File f = new File(filePath + "//" + inputFile);
		Scanner sr = null;
		LinkedList<WordInfoObject> allWords = new LinkedList<WordInfoObject>();
		try {
			sr = new Scanner(f);
			// Since we may have multiple files to be read we are iterating through the each line in files
			while (sr.hasNextLine()) {
				File file = new File(filePath + "//"+sr.nextLine());

				Scanner fileScanner = new Scanner(file);
				while (fileScanner.hasNextLine()) {
					// converting each line into tokens and then converting to lower case
					String abc = fileScanner.nextLine().toLowerCase();
					StringTokenizer st = new StringTokenizer(abc);
					while (st.hasMoreTokens()) {
						// verifying the word as per the problem statement
						String word = st.nextToken().replaceAll("[^A-Za-z]+", "");
						if (word.length() > 0) {
							WordInfoObject tmp = new WordInfoObject(word);
							int idx = allWords.indexOf(tmp);
							if (idx > 0) {
								// if a given word already exist or occurred then get object from
								// LinkedList and increase the word frequency by 1
								tmp = allWords.get(idx);
								tmp.setCount(tmp.getCount() + 1);
							} else {
								// if the given word is new it will add that into a LinkedList and mapping each
								// word with the frequency as 1
								tmp.setCount(1);
								uniqueWords.add(word);
								allWords.add(tmp);
							}
						}
					}
				}
				fileScanner.close();
			}
			
			// sorting the words String a compare to method
			allWords.sort((WordInfoObject o1, WordInfoObject o2) -> o1.getWord().compareTo(o2.getWord()));
			// to get the neighbors words in sort order
			uniqueWords.sort((String o1, String o2) -> o1.compareTo(o2));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sr != null) {
				sr.close();
			}
		}
		return allWords;
	}
	
	public static String getNeighbours(String inputWord) {
		LinkedList<String> neighbors = new LinkedList<String>();

		for (String w1 : uniqueWords) {
			// condition to consider only words with same length
			if (inputWord.length() == w1.length()) {
				int count = 0;
				// for loop to compare the char in each position and increase the counter if not
				// same
				for (int j = 0; j < inputWord.length(); j++) {
					if (!(inputWord.charAt(j) == w1.charAt(j))) {
						count++;
						if(count > 1) {
							break;
						}
					}
				}
				// after comparing every char in each position add the word to the LinkedList
				// only if it is differ by one char
				// as per problem statement
				if (count == 1) {
					neighbors.add(w1);
				}
			}
		}
		return neighbors.toString();
	}
	
	public static LinkedList<String> getPatternMatchingWords(LinkedList<WordInfoObject> lexiconWords, String filePath, String fileName) {
		File f = new File(filePath + "//" + fileName);
		Scanner sr = null;
		String pattern = null;
		LinkedList<String> matchedWords = new LinkedList<String>();
		try {
			sr = new Scanner(f);
			// reads the pattern value from input file
			while (sr.hasNextLine()) {
				pattern = sr.nextLine();
			}
			
			// replacing '?' with '.' as '.' indicates can match with
			// any one character in a word
			pattern = pattern.replace("?", ".");
			// replacing '*' with '.*' as '.' indicates can match with any number of
			// characters in a
			// word (zero or more).
			pattern = pattern.replace("*", ".*");

			// creating a regex pattern using compile class which takes a string as input
			Pattern patternObj = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
			
			for (String w1 : uniqueWords) {
				Matcher matcher = patternObj.matcher(w1);
				if (matcher.matches()) {
					// if pattern matches then get the word object for count value
					WordInfoObject tmp = new WordInfoObject(w1);
					int idx = lexiconWords.indexOf(tmp);
					if (idx > 0) {
						tmp = lexiconWords.get(idx);
						matchedWords.add(w1 + " " + tmp.getCount());
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sr != null) {
				sr.close();
			}
		}
		return matchedWords;
	}
}
