package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Subject;
import com.resource.DatabaseResource;

public class SubjectDao {
	public int storeSubject(Subject subject) {
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(subject);
		tran.commit();		
		return 1;
	}
	
	public List<Subject> findAllSubjects(){
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery<Subject> tq = session.createQuery("from Subject");
		List<Subject> listOfSubjects = tq.getResultList();
		return listOfSubjects;
	}
}
