package DataAccessLayer;





import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Admin;
import shared.DataAdmin;
 
public class DALAdmin implements IDALAdmin{
	public DALAdmin(){
		
	}               
	
	SessionFactory factory = Factory.getSessionFactory();
	public void addAdmin(String mail,String password, String nombre){	
		
		try{
			Session session = factory.openSession();
	        session.clear();	      
	        Admin a = new Admin();
			a.setMail(mail);
			a.setNombre(nombre);
			a.setPassword(password);
			Transaction tx = session.beginTransaction();
	        session.save(a);
	        tx.commit(); 
	        session.flush();
	        session.close();


		}catch(Exception e){
			System.err.println("errorrr " + e);
			
		}
		
	}
	
	
	public void deleteAdmin(String mail){
	
		Transaction tx= null;
		Session session = factory.openSession();
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
	}
	
	public boolean login(String mail,String pass){
		Session session = factory.openSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Admin a = (Admin) session.get(Admin.class, mail);
			
			if (pass.equals(a.getPassword()))
				return true;							
			
		} catch (HibernateException e) {
			if (tx != null)				
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
}
