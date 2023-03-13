package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.resource.DatabaseResource;

public class StudentDao {
	public int storeStudent(Student student) {
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(student);
		tran.commit();		
		return 1;
	}
	
	public List<Student> findAllStudents(){
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery<Student> tq = session.createQuery("from Student");
		List<Student> listOfStudents = tq.getResultList();
		return listOfStudents;
	}
}
