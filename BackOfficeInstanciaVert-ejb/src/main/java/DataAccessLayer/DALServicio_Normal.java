package DataAccessLayer;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import modelo.Normal;


public class DALServicio_Normal implements IDALServicio_Normal {
	SessionFactory factory = Factory.getInstance();
	public void addServicio_Normal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Normal n = new Normal(tarifa,tiempo_aceptacion,descripcion,nombre);
			session.save(n);
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
	
}
