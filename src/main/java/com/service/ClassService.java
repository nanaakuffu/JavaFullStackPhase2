package com.service;

import java.util.List;

import com.dao.ClassesDao;
import com.entity.Classes;

public class ClassService {
	ClassesDao classDao  = new ClassesDao();
	
	public String storeClass(Classes classes) {
		if(classDao.storeClass(classes)>0) {
			return "Class data stored successfully";
		}else {
			return "Class details didn't store";
		}
	}
	
	public List<Classes> findAllClasses() {
		return classDao.findAllClasses();
	}
}
