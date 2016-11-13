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

import shared.DataCoordenadas;
import shared.DataRegistroServicio;


@Entity
public class RegistroServicio {
	
	@Id
	@GeneratedValue
	private int registro_id;
	private float costo;
	private int duracion; //en minutos
	
	private double inicio_lat;
	private double inicio_long;
	private double destino_lat;
	private double destino_long;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "review_id")
	private Review review;
	private boolean terminado;
	
	public RegistroServicio(){}

	public RegistroServicio(float costo, int duracion, Date fecha, Review review, DataCoordenadas inicio, DataCoordenadas destino) {
		super();
		this.costo = costo;
		this.duracion = duracion;
		this.fecha = fecha;
		this.review = review;
		this.inicio_lat = inicio.getLat();
		this.inicio_long = inicio.getLng();
		this.destino_lat = destino.getLat();
		this.destino_long = destino.getLng();
	}
	
	public RegistroServicio(DataRegistroServicio drs) {
		super();
		this.costo = drs.getCosto();
		this.duracion = drs.getDuracion();
		this.fecha = drs.getFecha();
		this.review = new Review (drs.getReview());
		this.inicio_lat = drs.getInicio().getLat();
		this.inicio_long = drs.getInicio().getLng();
		this.destino_lat = drs.getDestino().getLat();
		this.destino_long = drs.getDestino().getLng();
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

	public double getInicio_lat() {
		return inicio_lat;
	}

	public void setInicio_lat(double inicio_lat) {
		this.inicio_lat = inicio_lat;
	}

	public double getInicio_long() {
		return inicio_long;
	}

	public void setInicio_long(double inicio_long) {
		this.inicio_long = inicio_long;
	}

	public double getDestino_lat() {
		return destino_lat;
	}

	public void setDestino_lat(double destino_lat) {
		this.destino_lat = destino_lat;
	}

	public double getDestino_long() {
		return destino_long;
	}

	public void setDestino_long(double destino_long) {
		this.destino_long = destino_long;
	}
}
