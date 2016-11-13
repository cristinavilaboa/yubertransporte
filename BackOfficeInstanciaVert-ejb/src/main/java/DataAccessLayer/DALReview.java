package DataAccessLayer;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Review;


public class DALReview implements IDALReview {
SessionFactory factory = Factory.getInstance();
	@Override
	public void addReview() {
		// TODO Auto-generated method stub
		
	
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Review r = new Review();
			session.save(r);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		

		
	}

	@Override
	public void addReviewDeCliente(int review_id, int puntaje_cliente, String comentario_cliente) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Review r =  (Review) session.get(Review.class,review_id);
			r.setPuntaje_cliente(puntaje_cliente);
			r.setComentario_cliente(comentario_cliente);
			session.update(r);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}

	@Override
	public void addReviewDeProveedor(int review_id, int puntaje_proveedor, String comentario_proveedor) {
	    Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Review r =  (Review) session.get(Review.class,review_id);
			r.setPuntaje_proveedor(puntaje_proveedor);
			r.setComentario_proveedor(comentario_proveedor);
			session.update(r);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		// TODO Auto-generated method stub
		
	}

}
