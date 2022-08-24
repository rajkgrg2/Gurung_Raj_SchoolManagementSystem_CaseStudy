package com.school.management.form;


import javax.validation.constraints.NotEmpty;

public class CreateVolunteerForm {
	
	@NotEmpty(message = "Field cannot be empty")
	private String first_name;
	
	@NotEmpty(message = "Field cannot be empty")
	private String last_name;

	@NotEmpty(message = "Field cannot be empty")
	private String title;

	@NotEmpty(message = "Field cannot be empty")
	private String city;

	@NotEmpty(message = "Field cannot be empty")
	private String country;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
