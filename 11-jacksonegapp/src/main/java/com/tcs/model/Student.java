package com.tcs.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Student {

	@JsonProperty(value = "Student_Id")
	private Integer studentId;
	@JsonProperty(value = "Student_Name")
	private String studentName;
	@JsonProperty(value = "Student_Course")
	private String course;
	@JsonProperty(value = "Student_Age")
	private Integer age;

}
