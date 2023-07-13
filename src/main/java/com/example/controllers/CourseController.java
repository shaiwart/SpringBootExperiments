package com.example.controllers;
import com.example.entity.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.CourseManager;

@RestController
public class CourseController {
	
	@Autowired
	private CourseManager c_manager;
	
	@PostMapping("/api/course")
	public void addCourse(@RequestBody Course course)
	{
		c_manager.addCourse(course);
	}
	
	
	@GetMapping("/api/getCourse")
	public List<Course> getAllStudents() {
		return c_manager.getAll();
	}

}
