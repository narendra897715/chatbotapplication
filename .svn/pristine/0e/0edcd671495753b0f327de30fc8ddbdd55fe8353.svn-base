package com.merilytics.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
public class HibernateUtil {

	public static Session getSession(HibernateTemplate ht){
	Session session = null;
	SessionFactory sf = null;
	try{
	sf = ht.getSessionFactory();
	session = sf.openSession();
	}catch (Exception e) {
		e.printStackTrace();
	}
	return session;
}
}
