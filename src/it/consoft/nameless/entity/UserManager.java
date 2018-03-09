package it.consoft.nameless.entity;

import it.consoft.nameless.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class UserManager {
	
	public static User saveUser(User user) {
		SessionFactory sf = UserManager.generateSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();

		s.persist(user);

		s.getTransaction().commit();
		s.close();
		
		return user;
	}

	public static User getUserById(int id) {
		
		return null;
		
	}

	public static User update(User user) {
		
		return null;
	}

	public static User delete(int id) {
		
		return null;
	}

	public static User getUserByUsernameAndPassword(String username, String password) {
		
		return null;
		
	}
	
	private static SessionFactory generateSessionFactory() {
		Configuration c = new Configuration().configure();
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            c.getProperties()).build();
		
		return c.buildSessionFactory(serviceRegistry);
	}
	
	/*
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		User steve = new User();
		steve.setUsername("stefano");

		session.persist(steve);

		session.getTransaction().commit();
		session.close();
	}*/
}
