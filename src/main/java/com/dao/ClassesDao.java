package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Classes;
import com.resource.DatabaseResource;

public class ClassesDao {
	public int storeClass(Classes classes) {
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(classes);
		tran.commit();		
		return 1;
	}
	
	public List<Classes> findAllClasses(){
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery<Classes> tq = session.createQuery("from Classes");
		List<Classes> listOfClasses = tq.getResultList();
		return listOfClasses;
	}
}
