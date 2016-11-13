package shared;

import java.util.List;

import modelo.Cliente;
import modelo.RegistroServicio;

import java.util.ArrayList;

public class DataCliente {
	
	private String fb_token;
	private String nombre;
	private String mail;
	private boolean habilitado;
	private double calificacion;
	private List<DataRegistroServicio> historial = new ArrayList<DataRegistroServicio>();
	//TODO falta agregar datos paypal
	
	public DataCliente() {}
	
	public DataCliente(String fb_token, String nombre, String mail, boolean habilitado, double calificacion, List<DataRegistroServicio> lista) {
		super();
		this.fb_token = fb_token;
		this.nombre = nombre;
		this.mail = mail;
		this.habilitado = habilitado;
		this.calificacion = calificacion;
		this.historial = lista;
	}
	
	public DataCliente(Cliente c) {
		super();
		this.fb_token = c.getFb_token();
		this.nombre = c.getNombre();
		this.mail = c.getMail();
		this.habilitado = c.isHabilitado();
		this.calificacion = c.getCalificacion();
		List<DataRegistroServicio> lista = new ArrayList<DataRegistroServicio>();
		for (RegistroServicio rs: c.getHistorial()){
			DataRegistroServicio dr = new DataRegistroServicio(rs);
			lista.add(dr);
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

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public List<DataRegistroServicio> getHistorial() {
		return historial;
	}

	public void setHistorial(List<DataRegistroServicio> historial) {
		this.historial = historial;
	}
}
