//Converting java objects to json
package com.tcs.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.model.Student;

public class StudentService {
public static void main(String[] args) throws JsonProcessingException {
	convertJavaObjstoJsonObjs();
	convertJavaObjToJson();
}

public static void convertJavaObjstoJsonObjs() throws JsonProcessingException {
	List<Student> studentList=new ArrayList<Student>();
	Student s=new Student();
	s.setStudentId(101);
	s.setStudentName("Elon");
	s.setAge(24);
	s.setCourse("java");
	Student s1=new Student();
	s1.setStudentId(102);
	s1.setStudentName("joffrey");
	s1.setCourse("python");
	s1.setAge(23);
	studentList.add(s1);
	studentList.add(s);
	ObjectMapper mapper=new ObjectMapper();
	String StudList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentList);
	System.out.println(StudList);
}

public static void convertJavaObjToJson() throws JsonProcessingException {
	Student s=new Student();
	s.setStudentId(101);
	s.setStudentName("Elon");
	s.setAge(24);
	s.setCourse("java");
	ObjectMapper mapper=new ObjectMapper();
	String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
	System.out.println(jsonString);
}
}
