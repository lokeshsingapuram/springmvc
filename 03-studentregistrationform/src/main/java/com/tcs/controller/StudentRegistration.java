package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.domain.Student;

@Controller
public class StudentRegistration {
	
	@GetMapping(value = {"/","/register"})
	public String loadStudentForm(Model model) {
		Student stud=new Student();
		model.addAttribute("student",stud);
		return "studentRegister";
	}
	
	@PostMapping("/register")
	public String submitStudentForm(@ModelAttribute("student")Student student,Model model) {
		System.out.println(student);
		model.addAttribute(student);
		model.addAttribute("success", "student registered sucessfully");
		return "Success";
	}

}
