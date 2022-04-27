package com.example.demo;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}

	@RequestMapping("/tools")
	String mytools() {
		return "Hello from my spring boot application Tool Application";

	}
	
	@RequestMapping("/student/{name}/{marks}")
	String studentInfo(@PathVariable String name,@PathVariable Long marks)
	{
		Student student = new Student(marks, name);
		return student.getGrade();
	}
	

}
