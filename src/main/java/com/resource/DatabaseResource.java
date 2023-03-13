package com.resource;

import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class DatabaseResource {
	public static SessionFactory getSessionFactory() throws HibernateException {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		return con.buildSessionFactory();
	}
}
