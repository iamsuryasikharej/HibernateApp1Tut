package com.surya.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.surya.entity.Employee;

public class Main {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
//		Employee m=new Employee();
//		m.setId(1);
//		m.setName("sury");
//		m.setId(2);
//		m.setName("surya");
//		session.save(m);
		Employee e=session.find(com.surya.entity.Employee.class, 2);
		tx.commit();
		System.out.println(e.getName());
	
		
		
	}

}
