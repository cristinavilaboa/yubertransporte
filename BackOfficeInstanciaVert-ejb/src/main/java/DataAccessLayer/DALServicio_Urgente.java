package DataAccessLayer;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import modelo.Urgente;


public class DALServicio_Urgente implements IDALServicio_Urgente{
	SessionFactory factory = Factory.getInstance();
	public void addServicio_Urgente(float tarifa, int tiempo_aceptacion, String descripcion, String nombre, int tiempo_respuesta, float costo_adicional){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Urgente u = new Urgente(tarifa,tiempo_aceptacion,descripcion,nombre,tiempo_respuesta,costo_adicional);
			session.save(u);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}
	
	public void modificarTiempoAceptacion(int servicio_id,int tiempo_aceptacion){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Urgente u = (Urgente) session.get(Urgente.class, servicio_id);
			u.setTiempo_aceptacion(tiempo_aceptacion);
			session.update(u);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}
	public void modificarTiempoRespuesta(int servicio_id,int tiempo_respuesta){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Urgente u = (Urgente) session.get(Urgente.class, servicio_id);
			u.setTiempo_respuesta(tiempo_respuesta);
			session.update(u);
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
			Urgente u = (Urgente) session.get(Urgente.class, servicio_id);
			u.setTarifa(tarifa);
			session.update(u);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}
	public void  modificarCostoextra(int servicio_id,float costo_extra){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Urgente u = (Urgente) session.get(Urgente.class, servicio_id);
			u.setCosto_adicional(costo_extra);
			session.update(u);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}
	
}
