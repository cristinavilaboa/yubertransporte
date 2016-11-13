package shared;

import modelo.Normal;

public class DataNormal extends DataServicio {

	public DataNormal() {}
	
	public DataNormal(Normal n){
		id = n.getServicio_id();
		tarifa = n.getTarifa();
		tiempo_aceptacion = n.getTiempo_aceptacion();
		descripcion = n.getDescripcion();
		nombre = n.getNombre();
	}
	
	public DataNormal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre) {
		super();
		this.tarifa = tarifa;
		this.tiempo_aceptacion = tiempo_aceptacion;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}
	
}
