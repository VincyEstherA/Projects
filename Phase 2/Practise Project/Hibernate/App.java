package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(students.class).buildSessionFactory();
		Session theSession=factory.getCurrentSession();
		try {
			students theLearner= new students();
			theSession.beginTransaction();
			theSession.save(theLearner);
			theSession.getTransaction().commit();
			System.out.println("new students successfully inserted");
			System.out.println("Learner id :" + theLearner.name);
		}finally
		{
			factory.close();
		}

	}

}
