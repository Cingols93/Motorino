package it.consoft.nameless.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import it.consoft.nameless.model.Componente;
import it.consoft.nameless.util.HibernateUtil;

public class ComponenteManager {

	public static Componente saveComponente(Componente componente) {
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.persist(componente);
		s.getTransaction().commit();
		s.close();
		HibernateUtil.close();
		return componente;
	}

	public static Componente getByComponenteId(int id) {
		Componente componente = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		componente = (Componente) s.createCriteria(Componente.class).add(Restrictions.eq("id", id)).uniqueResult();
		HibernateUtil.close();
		return componente;

	}
	
	public static Set<Componente> getAll() {
		Set<Componente> setComponente = new HashSet<Componente>();
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		for (Object c : s.createCriteria(Componente.class).list()) {
			setComponente.add((Componente) c);
		}

		return setComponente;
	}		

	public static Componente update(Componente componente) {
		return null;
	}

	public static Componente delete(int id) {

		return null;
	}

	public static void filler() {
		
		Componente comp1 = new Componente();
		comp1.setNome("Carburatore");
		comp1.setMarca("Racing");
		comp1.setAntifurto(false);
		comp1.setAccellerazione(2F);
		comp1.setFrenata(2F);
		comp1.setManovrabilita(1.5F);
		comp1.setVelocita(3F);
		comp1.setPrezzo(116.51F);
		
		Componente comp2 = new Componente();
		comp2.setNome("Ammortizzatore");
		comp2.setMarca("Gulp");
		comp2.setAntifurto(false);
		comp2.setAccellerazione(0F);
		comp2.setFrenata(1F);
		comp2.setManovrabilita(2F);
		comp2.setVelocita(2F);
		comp2.setPrezzo(79.97F);
		
		Componente comp3 = new Componente();
		comp3.setNome("VARIATORE 125/150cc ");
		comp3.setMarca("Racing");
		comp3.setAntifurto(false);
		comp3.setAccellerazione(4F);
		comp3.setFrenata(1.5F);
		comp3.setManovrabilita(2F);
		comp3.setVelocita(4F);
		comp3.setPrezzo(105.49F);
		
		Componente comp4 = new Componente();
		comp4.setNome("Marmitta");
		comp4.setMarca("Racing");
		comp4.setAntifurto(false);
		comp4.setAccellerazione(0F);
		comp4.setFrenata(0F);
		comp4.setManovrabilita(0F);
		comp4.setVelocita(0F);
		comp4.setPrezzo(104.99F);
		
		Componente comp5 = new Componente();
		comp5.setNome("125T-25 Cilindro 160cc 59mm");
		comp5.setMarca("Racing");
		comp5.setAntifurto(false);
		comp5.setAccellerazione(3F);
		comp5.setFrenata(1F);
		comp5.setManovrabilita(2F);
		comp5.setVelocita(5F);
		comp5.setPrezzo(264.50F);

		saveComponente(comp1);
		saveComponente(comp2);
		saveComponente(comp3);
		saveComponente(comp4);
		saveComponente(comp5);
	}

}