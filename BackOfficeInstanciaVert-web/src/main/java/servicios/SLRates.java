package servicios;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/rates")
public class SLRates {
	
	@GET
	@Path("/getnormal")
	public float getNormalRate(){
		return 0;
	}
	
	@POST
	@Path("/setnormal/{rate}")
	public void setNormalRate(@PathParam("rate")float rate){
		
	}
	
	@GET
	@Path("/getextra")
	public float getExtraRate(){
		return 0;
	}
	
	@POST
	@Path("/setextra/{rate}")
	public void setExtraRate(@PathParam("rate")float rate){
		
	}
}
