package com.school.management.form;


import javax.validation.constraints.NotEmpty;

public class EditCourseForm {

	@NotEmpty(message = "Field cannot be empty")
	private String id;

	@NotEmpty(message = "Field cannot be empty")
	private String courseName;
	
	@NotEmpty(message = "Field cannot be empty")
	private String semesterOffered;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSemesterOffered() {
		return semesterOffered;
	}

	public void setSemesterOffered(String semesterOffered) {
		this.semesterOffered = semesterOffered;
	}
}
