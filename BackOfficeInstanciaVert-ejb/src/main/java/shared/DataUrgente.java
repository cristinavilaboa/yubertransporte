package shared;

import modelo.Urgente;

public class DataUrgente extends DataServicio {
	
	private int tiempo_respuesta; //en minutos
	private float costo_adicional;

	public DataUrgente() {}
	
	public DataUrgente(Urgente u){
		tarifa = u.getTarifa();
		tiempo_aceptacion = u.getTiempo_aceptacion();
		descripcion = u.getDescripcion();
		nombre = u.getNombre();
		tiempo_respuesta = u.getTiempo_respuesta();
		costo_adicional = u.getCosto_adicional();
	}	
	
	public DataUrgente(float tarifa, int tiempo_aceptacion, String descripcion, String nombre, int tiempo_respuesta, float costo_adicional) {
		super();
		this.tarifa = tarifa;
		this.tiempo_aceptacion = tiempo_aceptacion;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.tiempo_respuesta = tiempo_respuesta;
		this.costo_adicional = costo_adicional;
	}
	
	public int getTiempo_respuesta() {
		return tiempo_respuesta;
	}

	public void setTiempo_respuesta(int tiempo_respuesta) {
		this.tiempo_respuesta = tiempo_respuesta;
	}

	public float getCosto_adicional() {
		return costo_adicional;
	}

	public void setCosto_adicional(float costo_adicional) {
		this.costo_adicional = costo_adicional;
	}
}
