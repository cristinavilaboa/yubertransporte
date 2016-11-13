package DataAccessLayer;



import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Admin;
import shared.DataAdmin;
 
@Stateless
@LocalBean
//@Local(IDALAdmin.class)

public class DALAdmin implements IDALAdmin{
	public DALAdmin(){
		
	}
	SessionFactory factory = Factory.getInstance();
	public String addAdmin(String mail,String password, String nombre){
		
		Session session = factory.openSession();
		Transaction tx = null;
		try{	
			tx = session.beginTransaction();			
			Admin a = new Admin(mail,password,nombre);
			session.save(a);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return "di de alta?";
		
		
	}
	/*
	public void deleteAdmin(String mail){
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Admin a = (Admin) session.get(Admin.class, mail);
			session.delete(a);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public DataAdmin getAdmin(String mail){
		Session session = factory.openSession();
		DataAdmin da = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Admin a = (Admin) session.get(Admin.class, mail);
			da = new DataAdmin(a);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return da;
	}*/
	
}
