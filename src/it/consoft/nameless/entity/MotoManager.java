package it.consoft.nameless.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import it.consoft.nameless.model.ColoreEnum;
import it.consoft.nameless.model.Moto;
import it.consoft.nameless.model.TipoMotoEnum;
import it.consoft.nameless.util.HibernateUtil;

public class MotoManager {
	
	public static Moto saveMoto(Moto moto) {
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.persist(moto);
		s.getTransaction().commit();
		s.close();
		HibernateUtil.close();
		return moto;
	}

	public static Moto getMotoById(int id) {
		Moto moto = null;
		HibernateUtil.createSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		moto = (Moto) s.createCriteria(Moto.class).add(Restrictions.eq("id", id))
				.uniqueResult();
		HibernateUtil.close();
		return moto;

	}

	public static Moto update(Moto moto) {
		return null;
	}

	public static Moto delete(int id) {

		return null;
	}
	
	public static void filler() {
		Moto moto1 = new Moto();
		moto1.setMarca("Ducati");
		moto1.setModello("999");
		moto1.setCilindrata(1000);
		moto1.setCavalli(194F);
		moto1.setVelocita(272.8F);
		moto1.setColore(ColoreEnum.ROSSO);
		moto1.setTipo(TipoMotoEnum.SPORTIVA);
		moto1.setAccelerazione(10F);
		moto1.setManovrabilita(6F);
		moto1.setFrenata(8F);
		moto1.setAntifurto(false);
		moto1.setPrezzo(6000F);
		
		Moto moto2 = new Moto();
		moto2.setMarca("BMW");
		moto2.setModello("R GS 1200");
		moto2.setCilindrata(1170);
		moto2.setCavalli(125F);
		moto2.setVelocita(200F);
		moto2.setColore(ColoreEnum.BLU);
		moto2.setTipo(TipoMotoEnum.ENDURO);
		moto2.setAccelerazione(7F);
		moto2.setManovrabilita(8F);
		moto2.setFrenata(8F);
		moto2.setAntifurto(false);
		moto2.setPrezzo(16950F);
		
		Moto moto3 = new Moto();
		moto3.setMarca("Derbi");
		moto3.setModello("GPR 125");
		moto3.setCilindrata(125);
		moto3.setCavalli(14.95F);
		moto3.setVelocita(120F);
		moto3.setColore(ColoreEnum.NERO);
		moto3.setTipo(TipoMotoEnum.SPORTIVA);
		moto3.setAccelerazione(5F);
		moto3.setManovrabilita(4F);
		moto3.setFrenata(5F);
		moto3.setAntifurto(false);
		moto3.setPrezzo(4020F);
		
		saveMoto(moto1);
		saveMoto(moto2);
		saveMoto(moto3);
		
	}

}


