package servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bussinessLayer.BLProveedor;
import shared.DataProveedor;

@Path("/providers")
public class SLProviders {
	@Inject private BLProveedor blP;
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void registrar(DataProveedor dp){
		blP.registrar(dp);
	}
	
	@GET
	@Path("/get/{fbtoken}")
	@Produces(MediaType.APPLICATION_JSON)
	public DataProveedor getProveedor(@PathParam("fbtoken")String fbtoken){
		return blP.getProveedor(fbtoken);
	}
	
	@GET
	@Path("/getallsinaceptar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DataProveedor> getProveedoresSinAceptar(){
		return blP.getProveedoresSinAceptar();
	}
	
	@POST
	@Path("/aceptar/{fbtoken}")
	public void aceptarProveedor(@PathParam("fbtoken")String fbtoken){
		blP.aceptarProveedor(fbtoken);
	}
	
	@POST
	@Path("/rechazar/{fbtoken}")
	public void rechazarProveedor(@PathParam("fbtoken")String fbtoken){
		blP.rechazarProveedor(fbtoken);
	}
}
