package com.domi.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Course {
	@NotEmpty
	private String name;

	@NotNull @NotEmpty
	private String category;

	@Range(min = 30, max = 120)
	private int minutes;

	public String getCategory() {
		return category;
	}

	public int getMinutes() {
		return minutes;
	}

	public String getName() {
		return name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setName(String name) {
		this.name = name;
	}

}
