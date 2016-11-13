package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.ArrayList;

@Entity
public class Cliente {
	
	@Id
	private String fb_token;
	private String nombre;
	private String mail;
	private boolean habilitado;
	private float calificacion;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private List<RegistroServicio> historial = new ArrayList<RegistroServicio>();
	//TODO falta agregar datos paypal
	
	public Cliente() {}
	
	public Cliente(String fb_token, String nombre, String mail, boolean habilitado, float calificacion, List<RegistroServicio> lista) {
		super();
		this.fb_token = fb_token;
		this.nombre = nombre;
		this.mail = mail;
		this.habilitado = habilitado;
		this.calificacion = calificacion;
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

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public List<RegistroServicio> getHistorial() {
		return historial;
	}

	public void addHistorial(RegistroServicio rs) {
		List<RegistroServicio> nuevoHistorial =new ArrayList<RegistroServicio>();
		nuevoHistorial.addAll(this.historial);
		nuevoHistorial.add(rs);
		this.historial= nuevoHistorial;
		 
	}
	
}
