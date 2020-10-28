package com.blakelong.springdemo.rest;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blakelong.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@RequestMapping("/students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Blake", "Allan"));
		students.add(new Student("John", "Andrews"));
		students.add(new Student("Wesley", "Kenneth"));
		
		return students;
	}
}
