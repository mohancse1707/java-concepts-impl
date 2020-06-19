package com.mohan.codeTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WordMatch {

	public static void main(String[] args) {

		if (args == null || args.length != 4) {
			System.out.println("Please enter the valid inputs");
			System.exit(0);
		}
		String input = System.getProperty("user.dir");
		File dir = new File(input);
		// path to the directory in which sample files exists
		String dirPath = dir.getAbsolutePath();
		String inputFile = args[0];
		// builds the lexicon words in WordInfoObject and added to LinkedList
		LinkedList<WordInfoObject> lexiconWords = LexiconHelper.buildLexicon(dirPath, inputFile);

		String lexiconOutputFile = args[1];
		String inputMatchingPattern = args[2];
		String matchingPatternOutputFile = args[3];

		try {
			// write the final output to a file as per requirement
			File output = new File(dirPath, lexiconOutputFile);
			FileWriter fw = new FileWriter(output);
			lexiconWords.forEach((word) -> {
				String word1 = word.getWord();
				int count = word.getCount();
				String neighbour = LexiconHelper.getNeighbours(word1);

				try {
					fw.write(word1 + " " + count + " " + neighbour);
					fw.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			fw.close();
			
			// validate the pattern and get matching words for pattern
			LinkedList<String> matchedWords = LexiconHelper.getPatternMatchingWords(lexiconWords, dirPath, inputMatchingPattern);
			
			output = new File(dirPath, matchingPatternOutputFile);
			FileWriter fw2 = new FileWriter(output);
			// checking the matching words exists are not. if found writes the words to file else message
			if(matchedWords.size() > 0) {
				matchedWords.forEach((word) -> {
					try {
						fw2.write(word);
						fw2.write("\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}else {
				fw2.write("No words in the lexicon match the pattern");
			}
			
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Programme executed");
	}

}
