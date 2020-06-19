package com.mohan.codeTest;

import java.util.ArrayList;

public class WordInfoObject {
	private String word;
	private int count;

	public WordInfoObject(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		}
		WordInfoObject obj = (WordInfoObject) arg0;
		return this.getWord().equals(obj.getWord());
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.getWord() == null ? 0 : this.getWord().hashCode());
		return super.hashCode();
	}

	@Override
	public String toString() {
		return this.getWord()+"-"+this.getCount();
	}
}
