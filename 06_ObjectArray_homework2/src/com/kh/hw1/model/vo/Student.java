package com.kh.hw1.model.vo;

public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	public Student() {}
	
	public Student(String name,String subject,int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void SetScore(int score) {
		this.score=score;
	}
	
	public String information() {
		return name + " / " + subject + " / " + score;
	}

}
