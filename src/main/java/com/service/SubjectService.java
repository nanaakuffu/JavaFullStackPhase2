package com.service;

import java.util.List;

import com.dao.SubjectDao;
import com.entity.Subject;

public class SubjectService {
	SubjectDao subjectDao  = new SubjectDao();
	
	public String storeSubject(Subject subject) {
		if(subjectDao.storeSubject(subject)>0) {
			return "Subject data stored successfully";
		}else {
			return "Subject details didn't store";
		}
	}
	
	public List<Subject> findAllSubjects() {
		return subjectDao.findAllSubjects();
	}
}
