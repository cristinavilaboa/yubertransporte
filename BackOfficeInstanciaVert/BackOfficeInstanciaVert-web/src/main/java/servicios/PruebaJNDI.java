package servicios;


import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/PruebaJNDI")
public class PruebaJNDI {
	//@EJB 
//	private IDALAdmin idA;
	@GET
	@Path("/PruebaJNDI1")
	 public void PruebaJNDI1() throws NamingException {
		
	        
	 }
	@GET
	@Path("/prueba2")
	@Produces(MediaType.TEXT_PLAIN)
	public String prueba() {
		//	return idA.addAdmin();
				return "AAA";	
      /*  Properties properties = new Properties();
        properties.put("java.naming.factory.initial", "org.jnp.interfaces.InitialContextFactory");
        properties.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
        properties.put("java.naming.provider.url", "jhttp-remoting://localhost:8081");
        Context context = new InitialContext(properties);
        IDALAdmin d= (IDALAdmin)context.lookup("java:global/BackOfficeInstanciaVertical-ear/BackOfficeInstanciaVert-ejb/DALAdmin!DataAccessLayer.IDALAdmin");

        d.addAdmin("PruebaConexion","PruebaConexion","PruebaConexion");
        return "aaa";*/
	}
	
}
