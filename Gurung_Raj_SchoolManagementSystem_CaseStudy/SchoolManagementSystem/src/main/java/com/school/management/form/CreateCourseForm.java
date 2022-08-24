package com.school.management.form;


import javax.validation.constraints.NotEmpty;

public class CreateCourseForm {
	
	@NotEmpty(message = "Field cannot be empty")
	private String courseName;
	
	@NotEmpty(message = "Field cannot be empty")
	private String semesterOffered;

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
