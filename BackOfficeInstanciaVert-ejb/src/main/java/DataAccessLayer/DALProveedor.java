package DataAccessLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Proveedor;
import modelo.RegistroServicio;
import shared.DataProveedor;
import shared.DataRegistroServicio;

public class DALProveedor implements IDALProveedor {
SessionFactory factory = Factory.getInstance();
	
	public void addProveedor(String fb_token,String nombre,String mail){
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();
			List<RegistroServicio> historial = new ArrayList<RegistroServicio>();
			Proveedor p = new Proveedor(fb_token,nombre,"Pendiente",mail,0,historial);
			session.save(p);
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
			Proveedor p = (Proveedor) session.get(Proveedor.class, fb_token);
			p.addHistorial(historial);
			session.update(p);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void habilitarProveedor(String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Proveedor p = (Proveedor) session.get(Proveedor.class, fb_token);
			p.setEstado("Habilitado");
			session.update(p);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void suspenderProveedor(String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Proveedor p = (Proveedor) session.get(Proveedor.class, fb_token);
			p.setEstado("Suspendido");
			session.update(p);
			tx.commit();			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public DataProveedor getProveedor(String fb_token){
		Session session = factory.openSession();
		DataProveedor dp = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Proveedor p = (Proveedor) session.get(Proveedor.class, fb_token);
			if (p==null){
				return null;
			}
			dp = new DataProveedor(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dp;
	}
	
	public void addRegistro(DataRegistroServicio drs, String fb_token){
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Proveedor p = (Proveedor) session.get(Proveedor.class, fb_token);
			RegistroServicio rs = new RegistroServicio(drs);
			p.addHistorial(rs);
			session.update(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public List<DataProveedor> getProveedoresSinAceptar(){
		Session session = factory.openSession();
		List<DataProveedor> dataproveedores = new ArrayList<DataProveedor>();
		try {
			@SuppressWarnings("unchecked")
			List<Proveedor> proveedores = session.createQuery("FROM Proveedor").list();			
			for (Iterator<Proveedor> iterator = proveedores.iterator(); iterator.hasNext();) {
				Proveedor p = (Proveedor) iterator.next();
				if (p.getEstado().equals("Pendiente")){
					DataProveedor dp = new DataProveedor(p);
					dataproveedores.add(dp);
				}
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dataproveedores;

	}
	public List<DataProveedor> getProveedores(){
		Session session = factory.openSession();
		System.out.println("ENTREEEEEEEEEE");
		List<DataProveedor> dataproveedores = new ArrayList<DataProveedor>();
		try {
			@SuppressWarnings("unchecked")
			List<Proveedor> proveedores = session.createQuery("FROM Proveedor").list();
			
			for (Iterator<Proveedor> iterator = proveedores.iterator(); iterator.hasNext();) {
				Proveedor p = (Proveedor) iterator.next();				
				DataProveedor dp = new DataProveedor(p);
				dataproveedores.add(dp);				
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dataproveedores;
	}
	
}
