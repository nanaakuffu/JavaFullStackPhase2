package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	StudentDao studentDao  = new StudentDao();
	
	public String storeStudent(Student product) {
		if(studentDao.storeStudent(product)>0) {
			return "Student data stored successfully";
		}else {
			return "Student details didn't store";
		}
	}
	
	public List<Student> findAllStudents() {
		return studentDao.findAllStudents();
	}
}
