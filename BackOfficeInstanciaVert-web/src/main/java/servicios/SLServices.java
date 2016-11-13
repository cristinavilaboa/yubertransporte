package servicios;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bussinessLayer.BLServices;
import shared.DataServicio;

@Path("/services")
public class SLServices {
	
	@Inject private BLServices blS;
	
	@POST
	@Path("/addservice")
	@Consumes(MediaType.APPLICATION_JSON)
	public int addService(DataServicio dt){
		return blS.addService(dt);
	}
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DataServicio> getAllServices(){
		return blS.getAllServicios();
	}
	
	@GET
	@Path("/get/{serviceid}")
	@Produces(MediaType.APPLICATION_JSON)
	public DataServicio getServicio(@PathParam("serviceid") int serviceid){
		return blS.getServicio(serviceid);
	}

	@GET
	@Path("/solicitarurgente/{id_cliente}/{longitud}/{latitud}")
	public int solicitarServicioUrgente(@PathParam("id_cliente")String id_cliente, @PathParam("longitud")double longitud, @PathParam("latitud")double latitud){
		//TODO guarda en la base el registro de servicio y devuele su id
		//se usa la hora para controlar el tiempo de respuesta
		//busca proveedores cercanos al cliente
		//falta pasarle la ubicacion
		return blS.solicitarUrgente(id_cliente, longitud, latitud);
	}
	
	@GET
	@Path("/solicitarnormal/{id_cliente}/{longitud}/{latitud}")
	public int solicitarServicioNormal(@PathParam("id_cliente")String id_cliente, @PathParam("longitud")double longitud, @PathParam("latitud")double latitud){
		//TODO guarda en la base el registro de servicio y devuele su id
		//se usa la hora para controlar el tiempo de respuesta
		//busca proveedores cercanos al cliente
		//falta pasarle la ubicacion
		return 0;
	}
	
	@POST
	@Path("/iniciar/{id_servicio}/{fecha_hora}")
	public void iniciarServicio(@PathParam("id_servicio")int id_servicio, @PathParam("fecha_hora")Date fecha_hora){
		//TODO guarda en la base el registro de servicio
	}
	
	@POST
	@Path("/finalizar/{id_servicio}/{fecha_hora}/{km}")
	public float finalizarViaje(@PathParam("id_servicio")int id_viaje, @PathParam("fecha_hora")Date fecha_hora, @PathParam("km")float km){
		//TODO busca en la bse el servicio iniciado, calcula tiempo y actualiza la base
		//devuelve el costo del viaje, falta pasarle el destino
		return 0;
	}
}
