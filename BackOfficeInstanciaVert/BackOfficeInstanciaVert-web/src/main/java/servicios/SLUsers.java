package servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bussinessLayer.BLCliente;
import shared.DataCliente;

@Path("/users")
public class SLUsers {
	
	@Inject private BLCliente blC;
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registrar(DataCliente dc){
		blC.registrar(dc);
	}
	
	@GET
	@Path("/get/{fbtoken}")
	@Produces(MediaType.APPLICATION_JSON)
	public DataCliente getCliente(@PathParam("fbtoken")String fbtoken){
		return blC.getCliente(fbtoken);
	}
}
