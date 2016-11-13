package servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import bussinessLayer.BLAdmin;
import shared.DataAdmin;


@Path("/administrators")
public class SLAdministrators {
	@Inject private BLAdmin blA;
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAdmin(DataAdmin admin){
		blA.addAdmin(admin);
		
	}
	
	@DELETE
	@Path("/delete/{mail}")
	public void deleteAdmin(@PathParam("mail")String mail){
		blA.deleteAdmin(mail);
	}
	
	@GET
	@Path("/login/{mail}/{pass}")
	public int loginAdmin(@PathParam("mail")String mail, @PathParam("pass")String pass){
		
		if (blA.login(mail, pass))
			return 1;
		else
			return 0;
	}
}