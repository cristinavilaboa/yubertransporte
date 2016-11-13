package servicios;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DataAccessLayer.DALAdmin;

@Path("/PruebaRest")
public class PruebaRest {
	//@EJB(lookup="java:global/BackOfficeInstanciaVert-ear/BackOfficeInstanciaVert-ejb/DALAdmin!DataAccessLayer.DALAdmin")
	@Inject private DALAdmin idA;
	@GET
	@Path("/A")
	@Produces(MediaType.TEXT_PLAIN)
	public void prueba() {
			 idA.addAdmin("a@a","","a");
				//return "AAABC";	}
	

}
}
