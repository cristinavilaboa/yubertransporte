package DataAccessLayer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import modelo.Cliente;
import modelo.RegistroServicio;
import shared.DataCliente;
import shared.DataRegistroServicio;

public class DALCliente implements IDALCliente {
	SessionFactory factory = Factory.getInstance();
	
	public void addCliente(String fb_token,String nombre,String mail){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();
			List<RegistroServicio> historial = new ArrayList<RegistroServicio>();
			Cliente c = new Cliente(fb_token,nombre,mail,true,0,historial);
			
			session.save(c);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public void addHistorial(String fb_token,RegistroServicio historial){
		
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Cliente c = (Cliente) session.get(Cliente.class, fb_token);
			c.addHistorial(historial);
			session.update(c);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public void habilitarCliente(String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Cliente c = (Cliente) session.get(Cliente.class, fb_token);
			c.setHabilitado(true);
			session.update(c);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void suspenderCliente(String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Cliente c = (Cliente) session.get(Cliente.class, fb_token);
			c.setHabilitado(false);
			session.update(c);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public DataCliente getCliente(String fb_token){
		Session session = factory.openSession();
		DataCliente dc = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Cliente c = (Cliente) session.get(Cliente.class, fb_token);
			if (c==null){
				return null;
			}
			dc = new DataCliente(c);
			tx.commit(); 
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dc;
	}
	
	public void addRegistro(DataRegistroServicio drs, String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Cliente c = (Cliente) session.get(Cliente.class, fb_token);
			RegistroServicio rs = new RegistroServicio(drs);
			c.addHistorial(rs);
			session.update(c);
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

