package servicios;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import shared.DataProveedor;

@Path("/providers")
public class SLProviders {
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registrar(DataProveedor dp){
		//TODO lo agrego a la base de datos
	}
	
	@GET
	@Path("/get/{fbtoken}")
	@Produces(MediaType.APPLICATION_JSON)
	public DataProveedor getProveedor(@PathParam("fbtoken")String fbtoken){
		//TODO me fijo si el usuario existe lo retorno sino retorno null
		return null;
	}
	
	@GET
	@Path("/getallsinaceptar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DataProveedor> getProveedoresSinAceptar(){
		List<DataProveedor> lista = new ArrayList<DataProveedor>();
		return lista;
	}
	
	@POST
	@Path("/aceptar/{fbtoken}")
	public void aceptarProveedor(@PathParam("fbtoken")String iduser){
		
	}
	
	@POST
	@Path("/rechazar/{fbtoken}")
	public void rechazarProveedor(@PathParam("fbtoken")String id_proveedor){
		
	}
}
