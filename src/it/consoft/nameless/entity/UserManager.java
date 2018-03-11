package it.consoft.nameless.entity;

import it.consoft.nameless.model.User;
import it.consoft.nameless.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class UserManager {

	public static User saveUser(User user) {
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.persist(user);
		s.getTransaction().commit();
		s.close();
		HibernateUtil.close();
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

	public static User getUserByUsernameAndPassword(String email, String password) {
		User user = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		user = (User) s.createCriteria(User.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password))
				.uniqueResult();
		HibernateUtil.close();
		return user;
	}
}
