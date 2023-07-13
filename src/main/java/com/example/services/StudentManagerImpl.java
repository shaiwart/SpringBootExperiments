package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repositories.StudentRepository;

@Service
public class StudentManagerImpl implements StudentManager 
{
	
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getStudents(String cname) {
		
		return repository.getStudents(cname);
	}
	
	@Override
	public List<Student> getAll() {
		return repository.findAll(); 
	}

}
