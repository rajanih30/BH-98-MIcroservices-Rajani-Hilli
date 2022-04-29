package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGradeController {
	
	private final StudentRepository studentRepository;
	
	StudentGradeController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@GetMapping("/students")
    List<StudentGrade> getAll(){
		return studentRepository.findAll();
	}
	
}
