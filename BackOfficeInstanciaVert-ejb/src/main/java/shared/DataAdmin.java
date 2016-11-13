package shared;

import modelo.Admin;

public class DataAdmin {
	
	private String mail;
	private String password;
	private String nombre;
	
	public DataAdmin() {}
	
	public DataAdmin(String mail, String password, String nombre) {
		super();
		this.mail = mail;
		this.password = password;
		this.nombre = nombre;
	}
	
	public DataAdmin(Admin a) {
		super();
		this.mail = a.getMail();
		this.password = a.getPassword();
		this.nombre = a.getNombre();
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
