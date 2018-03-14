package it.consoft.nameless.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import it.consoft.nameless.model.Moto;
import it.consoft.nameless.model.User;
import it.consoft.nameless.model.MotoComposta;
import it.consoft.nameless.util.HibernateUtil;

public class MotoCompostaManager {

	public static MotoComposta SaveMotoComposta(MotoComposta motocomposta) {
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.persist(motocomposta);
		s.getTransaction().commit();
		s.close();
		HibernateUtil.close();
		return motocomposta;
	}

	public static MotoComposta getById(int id) {
		MotoComposta motocomposta = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		motocomposta = (MotoComposta) s.createCriteria(MotoComposta.class).add(Restrictions.eq("id", id)).uniqueResult();
		HibernateUtil.close();
		return motocomposta;

	}

	public static Set<MotoComposta> getAll() {
		Set<MotoComposta> setMotoComposta = new HashSet<MotoComposta>();
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		for (Object mc : s.createCriteria(MotoComposta.class).list()) {
			setMotoComposta.add((MotoComposta) mc);
		}

		return setMotoComposta;
	}
	
	public static Set<MotoComposta> getAllUserMoto(User user){
	
		

		return setMotoComposta;
	}
	
	

	public static MotoComposta update(MotoComposta motocomposta) {
		return null;
	}

	public static MotoComposta delete(int id) {

		return null;
	}


}
