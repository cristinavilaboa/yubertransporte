package servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import shared.DataCliente;

@Path("/users")
public class SLUsers {
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registrar(DataCliente dc){
		//TODO lo agrego a la base de datos
	}
	
	@GET
	@Path("/get/{fbtoken}")
	@Produces(MediaType.APPLICATION_JSON)
	public DataCliente getCliente(@PathParam("fbtoken")String fbtoken){
		//TODO me fijo si el usuario existe en lo retorno sino retorno null
		return null;
	}
}
