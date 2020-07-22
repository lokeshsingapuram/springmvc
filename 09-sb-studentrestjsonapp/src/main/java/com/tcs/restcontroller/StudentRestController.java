package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.response.Student;

@RestController
public class StudentRestController {
	
	@GetMapping(value = "/stud/{sid}", produces = "application/json")
	public Student getStudentDetails(@PathVariable("sid") Integer sid) {
		Student s=new Student();
		if(sid==101) {
			s.setStudentId(101);
			s.setStudentName("lokesh");
			s.setStudentAddress("KNL");
		}else if(sid==102) {
			s.setStudentId(102);
			s.setStudentName("gouri");
			s.setStudentAddress("Knl");
		}
		return s;
	}

}
