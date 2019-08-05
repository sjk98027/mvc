package model;

public class Borad {
	private int boradSeq;
	private int originNumber;
	private String title;
	private String content;
	private String userId;
	private String createDate;

	public int getBoradSeq() {
		return boradSeq;
	}

	public void setBoradSeq(int boradSeq) {
		this.boradSeq = boradSeq;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	// date, borads_seq --> dao;


	public int getOriginNumber() {
		return originNumber;
	}

	public void setOriginNumber(int originNumber) {
		this.originNumber = originNumber;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Borad [boradSeq=" + boradSeq + ", originNumber=" + originNumber
				+ ", title=" + title + ", content=" + content + ", userId=" + userId + ", createDate=" + createDate
				+ "]";
	}

}
