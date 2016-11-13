package DataAccessLayer;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class Factory {

	/*private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;*/
	
	private static SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
            //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable th) {

            System.err.println("Enitial SessionFactory creation failed" + th);

            throw new ExceptionInInitializerError(th);

        }

    }

    /**
     * @return
     */
    public static SessionFactory getSessionFactory() {

        return sessionFactory;

    }
    public static SessionFactory getInstance(){
		
		try {
			

			
			    Configuration configuration = new Configuration();
			    configuration.configure();
			    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
			            configuration.getProperties()). buildServiceRegistry();
			    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			    return sessionFactory;
			    
			
		}  catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
	
	
}
}
