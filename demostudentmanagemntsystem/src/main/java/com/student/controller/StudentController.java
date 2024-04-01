package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/app")
public interface StudentController {
	@Autowired
	StudentService service;
	@PostMapping("/addstud")
	public Student createStudent(@RequestBody Student s) {
	
		return service.createStudent(s);
		
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable ("id")int id,@RequestBody Student s) {
		s.setStudid(id);
		return service.updateStudent(s);
		
	}
	@GetMapping("/readAll")
	public List<Student> getAllStudent() 
	{
		return service.getAllStudent();
	}
	@DeleteMapping("/remove/{id}")
	public String deleteStudent (@PathVariable("id")int id) 
 
	{
		return service.deleteStudent(id);
		
	}
	@GetMapping("/read/{id}")
	public Student getStudentById(@PathVariable("id")int id)
	{
		return service.getStudentById(id);
		
	}



 }
}