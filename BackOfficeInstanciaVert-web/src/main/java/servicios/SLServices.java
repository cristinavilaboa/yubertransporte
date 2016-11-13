package servicios;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import shared.DataServicio;

@Path("/services")
public class SLServices {
	
	@POST
	@Path("/setdatos")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setDatos(DataServicio dt){
		
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public DataServicio getServicio(){
		return null;
	}

	@GET
	@Path("/solicitarurgente{id_cliente}")
	public int solicitarServicioUrgente(@PathParam("id_cliente")String id_cliente){
		//TODO guarda en la base el registro de servicio y devuele su id
		//se usa la hora para controlar el tiempo de respuesta
		//busca proveedores cercanos al cliente
		//falta pasarle la ubicacion
		return 0;
	}
	
	@GET
	@Path("/solicitarnormal{id_cliente}")
	public int solicitarServicioNormal(@PathParam("id_cliente")String id_cliente){
		//TODO guarda en la base el registro de servicio y devuele su id
		//se usa la hora para controlar el tiempo de respuesta
		//busca proveedores cercanos al cliente
		//falta pasarle la ubicacion
		return 0;
	}
	
	@POST
	@Path("/iniciar{id_servicio}{fecha_hora}")
	public void iniciarServicio(@PathParam("id_servicio")int id_servicio, @PathParam("fecha_hora")Date fecha_hora){
		//TODO guarda en la base el registro de servicio
	}
	
	@POST
	@Path("/finalizar{id_servicio}{fecha_hora}{km}")
	public float finalizarViaje(@PathParam("id_servicio")int id_viaje, @PathParam("fecha_hora")Date fecha_hora, @PathParam("km")float km){
		//TODO busca en la bse el servicio iniciado, calcula tiempo y actualiza la base
		//devuelve el costo del viaje, falta pasarle el destino
		return 0;
	}
}
