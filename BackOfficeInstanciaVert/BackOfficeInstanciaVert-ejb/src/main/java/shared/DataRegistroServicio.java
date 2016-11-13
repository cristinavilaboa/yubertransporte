package shared;

import java.util.Date;

import modelo.RegistroServicio;

public class DataRegistroServicio {
	
	private float costo;
	private int duracion; //en minutos
	private Date fecha;
	private DataReview review;
	private boolean terminado;
	private DataCoordenadas inicio;
	private DataCoordenadas destino;
	
	public DataRegistroServicio(){}

	public DataRegistroServicio(float costo, int duracion, Date fecha, DataReview review, DataCoordenadas inicio, DataCoordenadas destino) {
		super();
		this.costo = costo;
		this.duracion = duracion;
		this.fecha = fecha;
		this.review = review;
		this.inicio = inicio;
		this.destino = destino;
	}

	public DataRegistroServicio(RegistroServicio rs) {
		super();
		this.costo = rs.getCosto();
		this.duracion = rs.getDuracion();
		this.fecha = rs.getFecha();
		this.review = new DataReview(rs.getReview());
		this.inicio = new DataCoordenadas(rs.getInicio_lat(), rs.getInicio_long());
		this.destino = new DataCoordenadas(rs.getDestino_lat(), rs.getDestino_long());
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

	public DataCoordenadas getInicio() {
		return inicio;
	}

	public void setInicio(DataCoordenadas inicio) {
		this.inicio = inicio;
	}

	public DataCoordenadas getDestino() {
		return destino;
	}

	public void setDestino(DataCoordenadas destino) {
		this.destino = destino;
	}
}
