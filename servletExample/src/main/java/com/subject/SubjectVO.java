package com.subject;

public class SubjectVO {
	private int no;
	private String subjectNumber;
	private String subjectName;

	public SubjectVO() {

	}

	public SubjectVO(int no, String subjectNumber, String subjectName) {
		super();
		this.no = no;
		this.subjectNumber = subjectNumber;
		this.subjectName = subjectName;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(String subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "SubjectVO [no=" + no + ", subjectNumber=" + subjectNumber + ", subjectName=" + subjectName + "]";
	}

	
	
}
