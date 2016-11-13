package shared;

public class DataNormal extends DataServicio {

	public DataNormal() {}
	
	public DataNormal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre) {
		super();
		this.tarifa = tarifa;
		this.tiempo_aceptacion = tiempo_aceptacion;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}
	
}
