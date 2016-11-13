package DataAccessLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Normal;
import modelo.Servicio;
import modelo.Urgente;
import shared.DataNormal;
import shared.DataServicio;
import shared.DataUrgente;

public class DALServicio implements IDALServicio {
	
	SessionFactory factory = Factory.getInstance();
	
	public DataServicio getServicio(int serviceid){
		Session session = factory.openSession();
		DataServicio ds = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Servicio s = (Servicio) session.get(Servicio.class, serviceid);
			if (s instanceof Normal){
				Normal n = (Normal)s;
				ds = new DataNormal(n);
			} else {
				Urgente u = (Urgente)s;
				ds = new DataUrgente(u);
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ds;
	}
	
	public List<DataServicio> getAllServicios(){
		Session session = factory.openSession();
		List<DataServicio> dataservicios = new ArrayList<DataServicio>();
		try {
			@SuppressWarnings("unchecked")
			List<Servicio> servicios = session.createQuery("FROM Servicio").list();
			for (Iterator<Servicio> iterator = servicios.iterator(); iterator.hasNext();) {
				Servicio s = (Servicio) iterator.next();
				DataServicio ds = null;
				if (s instanceof Normal){
					Normal n = (Normal)s;
					ds = new DataNormal(n);
				} else {
					Urgente u = (Urgente)s;
					ds = new DataUrgente(u);
				}
				dataservicios.add(ds);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dataservicios;


	}
	
}
