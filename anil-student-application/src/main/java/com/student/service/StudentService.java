package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	String saveStudentDetails(Student student);

	List<Student> getAllStudentRecords();

	Student getDetailsById(Integer studentId);

	List<Student> getDetailsByName(String studentName);

}
