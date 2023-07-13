package com.example.services;

import java.util.List;

import com.example.entity.Student;

public interface StudentManager 
{
	List<Student> getStudents(String cname);
	
	List<Student> getAll();
}
