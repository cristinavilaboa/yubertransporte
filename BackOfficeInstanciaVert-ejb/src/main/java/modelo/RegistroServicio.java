package modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import shared.DataRegistroServicio;


@Entity
public class RegistroServicio {
	
	//TODO ver como se guardan origen y destino
	@Id
	@GeneratedValue
	private int registro_id;
	private float costo;
	private int duracion; //en minutos
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "review_id")
	private Review review;
	private boolean terminado;
	
	public RegistroServicio(){}

	public RegistroServicio(float costo, int duracion, Date fecha, Review review) {
		super();
		this.costo = costo;
		this.duracion = duracion;
		this.fecha = fecha;
		this.review = review;
	}
	
	public RegistroServicio(DataRegistroServicio drs) {
		super();
		this.costo = drs.getCosto();
		this.duracion = drs.getDuracion();
		this.fecha = drs.getFecha();
		this.review = new Review (drs.getReview());
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	
	public int getRegistro_id() {
		return registro_id;
	}

	public void setRegistro_id(int registro_id) {
		this.registro_id = registro_id;
	}
}
