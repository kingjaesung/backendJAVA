package com.mvc.board.vo;

public class BoardVO {

	private int num;
	private String author;
	private String title;
	private String content;
	private int readcnt;
	private String writeday;
	private String passwd;

	public BoardVO() {
		super();
	}

	public BoardVO(int num, String author, String title, String content, int readcnt, String writeday, String passwd) {
		super();
		this.num = num;
		this.author = author;
		this.title = title;
		this.content = content;
		this.readcnt = readcnt;
		this.writeday = writeday;
		this.passwd = passwd;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", author=" + author + ", title=" + title + ", content=" + content + ", readcnt="
				+ readcnt + ", writeday=" + writeday + ", passwd=" + passwd + "]";
	}

}
