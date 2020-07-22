//converting json objects to java
package com.tcs.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.model.Student;

public class StudentServices {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		convertJsonObjToJavaObj();
		convertJsonObjsToJavaObjs();
	}

	public static void convertJsonObjToJavaObj() throws IOException, JsonParseException, JsonMappingException {
		File f=new File("Student.json");
		ObjectMapper mapper=new ObjectMapper();
	Student javaobj = mapper.readValue(f, Student.class);
	System.out.println(javaobj);
	}
	public static void convertJsonObjsToJavaObjs() throws IOException, JsonParseException, JsonMappingException {
		File f=new File("Students.json");
		ObjectMapper mapper=new ObjectMapper();
	Student[] javaobj = mapper.readValue(f, Student[].class);
	for(Student s:javaobj) {
		System.out.println(s);

	}
	}

}
