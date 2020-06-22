package com.tcs.domain;

import lombok.Data;

@Data
public class Student {
	
	private int studentId;
	private String studentName;
	private String email;
	private String password;
	private String studentAddress;
	private String gender;
	private String courses;
	private String[] preferedTimings;
	

}
