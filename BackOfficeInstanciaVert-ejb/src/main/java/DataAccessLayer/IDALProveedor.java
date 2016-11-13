package DataAccessLayer;

import modelo.RegistroServicio;

public interface IDALProveedor {
	public void addProveedor(String fb_token,String nombre,String mail);//implementado
	public void addHistorial(String fb_token,RegistroServicio historial);//implementado
	public void habilitarProveedor(String fb_token);//implementado
	public void suspenderProveedor(String fb_token);//implementado
}
