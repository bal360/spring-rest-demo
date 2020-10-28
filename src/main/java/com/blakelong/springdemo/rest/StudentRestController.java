package com.blakelong.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blakelong.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	// define @PostConstruct to load the student data  ... only once!
	@PostConstruct
	public void loadData() {

		students = new ArrayList<Student>();
		
		students.add(new Student("Blake", "Allan"));
		students.add(new Student("John", "Andrews"));
		students.add(new Student("Wesley", "Kenneth"));
		
	}
	
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
	
		return students;
	}
	
	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		return students.get(studentId);
	}
}
