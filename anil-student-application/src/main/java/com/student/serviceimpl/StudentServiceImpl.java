package com.student.serviceimpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Student> getAllStudentRecords() {
		List<Student> response = studentRepository.findAll();
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("Data is empty");
		}
		return response;
	}

	@Override
	public Student getDetailsById(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is empty");
		}
		return response.get();
	}

	@Override
	public List<Student> getDetailsByName(String studentName) {
		List<Student> response = studentRepository.findByStudentName(studentName);
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("Data is empty");
		}
		return response;
	}

}
