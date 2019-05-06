package cn.ekgc.dms.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long courseId;
	private String courseName;
	private Date courseStart;
	private Date courseEnd;
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getCourseStart() {
		return courseStart;
	}
	public void setCourseStart(Date courseStart) {
		this.courseStart = courseStart;
	}
	public Date getCourseEnd() {
		return courseEnd;
	}
	public void setCourseEnd(Date courseEnd) {
		this.courseEnd = courseEnd;
	}
	
}
