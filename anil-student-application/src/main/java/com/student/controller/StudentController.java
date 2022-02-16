package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		String response = studentService.saveStudentDetails(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Student>> getAllStudentDetails() {
		List<Student> response = studentService.getAllStudentRecords();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/details/{studentId}")
	public ResponseEntity<Student> getDetails(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getDetailsById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/details/name/{studentName}")
	public ResponseEntity<List<Student>> getDetails(@PathVariable("studentName") String studentName) {
		List<Student> response = studentService.getDetailsByName(studentName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
