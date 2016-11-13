package shared;

import java.util.ArrayList;
import java.util.List;

import modelo.Proveedor;
import modelo.RegistroServicio;

public class DataProveedor {
	
	private String fb_token;
	private String nombre;
	private String estado;
	private String mail;
	private float calificacion;
	private List<DataRegistroServicio> historial = new ArrayList<DataRegistroServicio>();
	//TODO falta agregar datos paypal
	
	public DataProveedor(){}
	
	public DataProveedor(String fb_token, String nombre,  String estado,String mail, float calificacion,
			List<DataRegistroServicio> historial) {
		super();
		this.fb_token = fb_token;
		this.nombre = nombre;
		this.setEstado(estado);
		this.mail = mail;
		this.calificacion = calificacion;
		this.historial = historial;
	}
	
	public DataProveedor(Proveedor p) {
		super();
		this.fb_token = p.getFb_token();
		this.nombre = p.getNombre();
		this.setEstado(p.getEstado());
		this.mail = p.getMail();
		this.calificacion = p.getCalificacion();
		List<DataRegistroServicio> lista = new ArrayList<DataRegistroServicio>();
		for(RegistroServicio rs: p.getHistorial()){
			DataRegistroServicio drs = new DataRegistroServicio(rs);
			lista.add(drs);
		}
		this.historial = lista;
	}

	public String getFb_token() {
		return fb_token;
	}

	public void setFb_token(String fb_token) {
		this.fb_token = fb_token;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public List<DataRegistroServicio> getHistorial() {
		return historial;
	}

	public void setHistorial(List<DataRegistroServicio> historial) {
		this.historial = historial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
