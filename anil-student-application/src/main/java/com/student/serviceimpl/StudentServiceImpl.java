package com.student.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudentDetails(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "student data not saved";
		}
		return "student data saved succesfully";
	}

}
