package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class Admin {
	
	@Id
	private String mail;
	private String password;
	private String nombre;
	
	public Admin() {}
	
	public Admin(String mail, String password, String nombre) {
		super();
		this.mail = mail;
		this.password = password;
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
