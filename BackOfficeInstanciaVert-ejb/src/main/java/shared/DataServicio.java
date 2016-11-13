package shared;

public abstract class DataServicio {
	
	protected float tarifa;
	protected int tiempo_aceptacion; //en minutos
	protected String descripcion;
	protected String nombre;
	
	public DataServicio(){}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	public int getTiempo_aceptacion() {
		return tiempo_aceptacion;
	}

	public void setTiempo_aceptacion(int tiempo_aceptacion) {
		this.tiempo_aceptacion = tiempo_aceptacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
