package DataAccessLayer;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Normal;
import modelo.Servicio;


public class DALServicio_Normal implements IDALServicio_Normal {
	
	SessionFactory factory = Factory.getInstance();
	
	public int addServicio_Normal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre){
		Session session = factory.openSession();
		Transaction tx = null;
		int id = 0;
		try{	
			tx = session.beginTransaction();			
			Normal n = new Normal(tarifa,tiempo_aceptacion,descripcion,nombre);
			id = (int) session.save(n);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}	
		return id;
	}
	
	public void modificarTiempoAceptacion(int servicio_id,int tiempo_aceptacion){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Normal n = (Normal) session.get(Normal.class, servicio_id);
			n.setTiempo_aceptacion(tiempo_aceptacion);
			session.update(n);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void modificarTarifa(int servicio_id,float tarifa){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Normal n = (Normal) session.get(Normal.class, servicio_id);
			n.setTarifa(tarifa);
			session.update(n);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public float getNormalRate(int serviceid){
		Session session = factory.openSession();
		Transaction tx = null;
		float f = 0;
		try {
			tx = session.beginTransaction();
			Servicio s = (Servicio) session.get(Servicio.class, serviceid);
			if (s==null){
				return 0;
			}
			f = s.getTarifa();
			tx.commit(); 
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return f;
	}
}
