package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Teacher;
import com.resource.DatabaseResource;

public class TeacherDao {
	public int storeTeacher(Teacher teacher) {
		SessionFactory sf = DatabaseResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(teacher);
		tran.commit();
		return 1;
	}

//	public List<Teacher> findAllTeachers() {
//		try {
//			SessionFactory sf = DatabaseResource.getSessionFactory();
//			Session session = sf.openSession();
//			TypedQuery<Teacher> tq = session.createQuery("select t from Teacher t");
//			return tq.getResultList();
//		} catch (HibernateException hex) {
//			System.out.println(hex.getMessage());
//			return new ArrayList<>();
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//			return new ArrayList<>();
//		}
//	}
}
