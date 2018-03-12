package it.consoft.nameless.entity;

import it.consoft.nameless.model.User;
import it.consoft.nameless.servlet.LoginServlet;
import it.consoft.nameless.util.HibernateUtil;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class UserManager {

	private static final Logger logger = Logger.getLogger(LoginServlet.class.getName());

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
		User user = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		user = (User) s.createCriteria(User.class).add(Restrictions.eq("id", id)).uniqueResult();
		HibernateUtil.close();
		return user;

	}

	public static User update(User user) {
		return null;
	}

	public static void delete(User user) {

	}

	public static User getUserByUsernameAndPassword(String email, String password) {
		User user = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		user = (User) s.createCriteria(User.class).add(Restrictions.eq("email", email))
				.add(Restrictions.eq("password", password)).uniqueResult();
		HibernateUtil.close();
		return user;
	}
}
