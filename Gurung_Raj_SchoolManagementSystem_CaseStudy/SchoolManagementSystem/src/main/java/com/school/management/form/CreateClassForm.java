package com.school.management.form;


import javax.validation.constraints.NotEmpty;

public class CreateClassForm {
	
	@NotEmpty(message = "Field cannot be empty")
	private String class_name;
	
	@NotEmpty(message = "Field cannot be empty")
	private String description;

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
