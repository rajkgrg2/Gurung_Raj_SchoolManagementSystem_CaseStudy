package com.school.management.form;


import javax.validation.constraints.NotEmpty;

public class CreateStudentForm {
	
	@NotEmpty(message = "Field cannot be empty")
	private String first_name;
	
	@NotEmpty(message = "Field cannot be empty")
	private String last_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
