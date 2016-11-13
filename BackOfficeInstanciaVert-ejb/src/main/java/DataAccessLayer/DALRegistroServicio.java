package DataAccessLayer;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.RegistroServicio;
import modelo.Review;
import shared.DataRegistroServicio;

public class DALRegistroServicio implements IDALRegistroServicio {
	
	SessionFactory factory = Factory.getInstance();
	
	public int addRegistro(DataRegistroServicio drs){
		Session session = factory.openSession();
		Transaction tx = null;
		int id = 0;
		try{	
			tx = session.beginTransaction();
			RegistroServicio rs = new RegistroServicio(drs);
			id = (int)session.save(rs);
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
	
	public void addReview(int registro_id, Review review){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();
			
			RegistroServicio rs = (RegistroServicio) session.get(RegistroServicio.class,registro_id);
		    rs.setReview(review);
			session.update(rs);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public void finalizarRegistro(int registro_id,float costo,int duracion){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();
			
			RegistroServicio rs = (RegistroServicio) session.get(RegistroServicio.class,registro_id);
		    rs.setTerminado(true);
		    rs.setCosto(costo);
		    rs.setDuracion(duracion);
			session.update(rs);
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
