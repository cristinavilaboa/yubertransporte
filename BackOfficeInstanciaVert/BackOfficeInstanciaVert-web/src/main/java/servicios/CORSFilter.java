package servicios;

import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;;

@Provider
public class CORSFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response){
		 response.getHeaders().add("Access-Control-Allow-Origin", "*");
	        response.getHeaders().add("Access-Control-Allow-Headers",
	                "origin, content-type, accept, authorization");
	        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
	        response.getHeaders().add("Access-Control-Allow-Methods",
	                "GET, POST, PUT, DELETE, OPTIONS, HEAD");

	       
	}

}
