package com.techelevator.wrestlermodel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Wrestler {
	private Long id;
	private String firstName;
	private String lastName;
	private int weightClass;
	private String grade;
	private LocalDateTime dateSubmitted;
	private String formattedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public int getWeightClass() {
		return weightClass;
	}
	public void setWeightClass(int weightClass) {
		this.weightClass = weightClass;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
		
	}
	public String getFormattedDate() {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM-dd-yyyy");
		formattedDate = getDateSubmitted().format(formatter);
		//formattedDate = formattedDate.replaceAll("-", "/");
		return formattedDate;
	}
	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
}
