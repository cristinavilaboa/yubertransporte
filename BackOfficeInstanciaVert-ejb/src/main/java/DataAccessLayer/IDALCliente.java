package DataAccessLayer;


import modelo.RegistroServicio;

public interface IDALCliente {
	public void addCliente(String fb_token,String nombre,String mail);//implementado
	public void addHistorial(String fb_token,RegistroServicio historial);//implementado
	public void habilitarCliente(String fb_token);//implementado
	public void suspenderCliente(String fb_token);//implementado
	
}
