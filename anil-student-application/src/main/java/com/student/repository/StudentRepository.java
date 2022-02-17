package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// List<Student> findByStudentName(String studentName);

	//@Query("SELECT * FROM Student s where s.studentName=:studentName")
	//List<Student> getByStudentName(String studentName);
	
	@Query(value = "SELECT * FROM student_table where student_name=:studentName", nativeQuery = true)
	List<Student> getByStudentName(String studentName);

}
