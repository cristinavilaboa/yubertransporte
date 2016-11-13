package modelo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "servicio_id", column = @Column(name = "normal_id"))
})
public class Normal extends Servicio {

	public Normal() {}
	
	public Normal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre) {
		super();
		this.tarifa = tarifa;
		this.tiempo_aceptacion = tiempo_aceptacion;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}	
}
