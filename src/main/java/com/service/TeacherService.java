package com.service;

import java.util.List;

import com.dao.TeacherDao;
import com.entity.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();

	public String storeTeacher(Teacher teacher) {
		if (teacherDao.storeTeacher(teacher) > 0) {
			return "Teacher data stored successfully";
		} else {
			return "Teacher details didn't store";
		}
	}

//	public List<Teacher> findAllTeachers() {
//		return teacherDao.findAllTeachers();
//	}
}
