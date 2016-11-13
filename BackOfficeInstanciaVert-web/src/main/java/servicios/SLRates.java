package servicios;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import bussinessLayer.BLRates;

@Path("/rates")
public class SLRates {
	
	@Inject private BLRates blR;
	@GET
	@Path("/getnormal/{serviceid}")
	public float getNormalRate(@PathParam("serviceid") int serviceid){
		return blR.getNormalRate(serviceid);
	}
	
	@POST
	@Path("/setnormal/{rate}/{serviceid}")
	public void setNormalRate(@PathParam("rate")float rate, @PathParam("serviceid") int serviceid){
		blR.setNormalRate(rate, serviceid);
	}
	
	@GET
	@Path("/getextra/{serviceid}")
	public float getExtraRate(@PathParam("serviceid") int serviceid){
		return blR.getExtra(serviceid);
	}
	
	@POST
	@Path("/setextra/{rate}/{serviceid}")
	public void setExtraRate(@PathParam("rate")float rate, @PathParam("serviceid") int serviceid){
		blR.setExtra(rate, serviceid);
	}
}
