package cn.ekgc.dms.pojo.entity;

import java.io.Serializable;

public class UserCourse implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String courseName;
	private Double score;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
}
