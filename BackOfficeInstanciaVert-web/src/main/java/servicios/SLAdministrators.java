package servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import shared.DataAdmin;


@Path("/administrators")
public class SLAdministrators {
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAdmin(DataAdmin admin){
		
	}
	
	@DELETE
	@Path("/delete/{mail}")
	public void deleteAdmin(@PathParam("mail")String mail){
		
	}
	
	@GET
	@Path("/login/{mail}{pass}")
	public boolean loginAdmin(@PathParam("mail")String mail, @PathParam("pass")String pass){
		return false;
	}
}