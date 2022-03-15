package com.day26.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.day26.project2.user;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(user.class)
				.buildSessionFactory();
		
Session session = factory.getCurrentSession();

try {
//create object of entity class type
//user us = new user();
//user us = new user(2,"usa",8767896,"tsd@g.com");
user us = new user(9,"aftab", 9652491, "aft@f.com");
//
session.beginTransaction();
//
session.save(us);

//us = session.get(user.class, 2);

//session.delete(user);
session.getTransaction().commit();
//System.out.println("Row added");
System.out.println(us);


}

finally {
	session.close();
	factory.close();
}

}

}
