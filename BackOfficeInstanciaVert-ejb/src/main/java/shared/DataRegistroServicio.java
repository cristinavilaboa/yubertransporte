package shared;

import java.util.Date;

import modelo.RegistroServicio;

public class DataRegistroServicio {
	
	//TODO ver como se guardan origen y destino
	private float costo;
	private int duracion; //en minutos
	private Date fecha;
	private DataReview review;
	private boolean terminado;
	
	public DataRegistroServicio(){}

	public DataRegistroServicio(float costo, int duracion, Date fecha, DataReview review) {
		super();
		this.costo = costo;
		this.duracion = duracion;
		this.fecha = fecha;
		this.review = review;
	}

	public DataRegistroServicio(RegistroServicio rs) {
		super();
		this.costo = rs.getCosto();
		this.duracion = rs.getDuracion();
		this.fecha = rs.getFecha();
		this.review = new DataReview(rs.getReview());
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

	public DataReview getReview() {
		return review;
	}

	public void setReview(DataReview review) {
		this.review = review;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
}
