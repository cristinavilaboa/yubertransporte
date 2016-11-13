package modelo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "servicio_id", column = @Column(name = "urgente_id"))
})
public class Urgente extends Servicio {
	
	private int tiempo_respuesta; //en minutos
	private float costo_adicional;

	public Urgente() {}
	
	public Urgente(float tarifa, int tiempo_aceptacion, String descripcion, String nombre, int tiempo_respuesta, float costo_adicional) {
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
