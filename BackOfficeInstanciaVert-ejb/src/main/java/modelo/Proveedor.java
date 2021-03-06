package modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Proveedor {
	
	@Id
	private String fb_token;
	private String nombre;
	private String estado;
	private String mail;
	private float calificacion;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "proveedor_id")
	private List<RegistroServicio> historial = new ArrayList<RegistroServicio>();
	//TODO falta agregar datos paypal
	
	public Proveedor(){}
	
	public Proveedor(String fb_token, String nombre, String estado, String mail, float calificacion,
			List<RegistroServicio> historial) {
		super();
		this.fb_token = fb_token;
		this.nombre = nombre;
		this.estado = estado;
		this.mail = mail;
		this.calificacion = calificacion;
		this.historial = historial;
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

	public List<RegistroServicio> getHistorial() {
		return historial;
	}

	public void addHistorial(RegistroServicio rs) {
		List<RegistroServicio> nuevoHistorial =new ArrayList<RegistroServicio>();
		nuevoHistorial.addAll(this.historial);
		nuevoHistorial.add(rs);
		this.historial= nuevoHistorial;
		 
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
