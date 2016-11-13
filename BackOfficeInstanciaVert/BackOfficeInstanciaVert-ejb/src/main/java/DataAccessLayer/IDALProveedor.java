package DataAccessLayer;

import java.util.List;

import modelo.RegistroServicio;
import shared.DataProveedor;

public interface IDALProveedor {
	public void addProveedor(String fb_token,String nombre,String mail);//implementado
	public void addHistorial(String fb_token,RegistroServicio historial);//implementado
	public void habilitarProveedor(String fb_token);//implementado
	public void suspenderProveedor(String fb_token);//implementado
	public List<DataProveedor> getProveedoresSinAceptar();
	public List<DataProveedor> getProveedores();
	public DataProveedor getProveedor(String fb_token);
}
