package servicios;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DataAccessLayer.IDALAdmin;

@Path("/PruebaRest")
public class PruebaRest {
	@EJB(lookup= "java:global/BackOfficeInstanciaVert-ear/BackOfficeInstanciaVert-ejb/DALAdmin!DataAccessLayer.DALAdmin") 
	private IDALAdmin idA;
	@GET
	@Path("/A")
	@Produces(MediaType.TEXT_PLAIN)
	public String prueba() {
			return idA.addAdmin("PruebaCOn","PRuebaCon","PruebaCOn");
				//return "AAABC";	}
	

}
}
