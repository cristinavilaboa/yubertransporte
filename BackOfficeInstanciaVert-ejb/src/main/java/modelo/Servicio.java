package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Servicio {
	
	
	@Id
	@GeneratedValue
	protected int servicio_id;
	protected float tarifa;
	protected int tiempo_aceptacion; //en minutos
	protected String descripcion;
	protected String nombre;
	
	
	public Servicio(){}
	
	public Servicio(float tarifa,int tiempo_aceptacion,String descripcion,String nombre) {
		super();
		this.tarifa = tarifa;
		this.tiempo_aceptacion = tiempo_aceptacion;
		this.descripcion = descripcion;
		this.nombre = nombre;		
	}

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

	public int getServicio_id() {
		return servicio_id;
	}

	public void setServicio_id(int servicio_id) {
		this.servicio_id = servicio_id;
	}
}
