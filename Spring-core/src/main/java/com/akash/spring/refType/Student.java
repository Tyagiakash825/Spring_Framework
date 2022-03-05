package com.akash.spring.refType;

public class Student {
	private Scrore score;

	public Scrore getScore() {
		return score;
	}

	public void setScore(Scrore score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}

}
