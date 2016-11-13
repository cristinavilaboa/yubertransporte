package bussinessLayer;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALProveedor;
import DataAccessLayer.IDALProveedor;
import shared.DataProveedor;

/**
 * Session Bean implementation class BLProveedor
 */
@Stateless
@LocalBean
public class BLProveedor {
	
	private IDALProveedor ip = new DALProveedor();

    public BLProveedor() {
    }
    
    public void registrar(DataProveedor dp){
    	ip.addProveedor(dp.getFb_token(), dp.getNombre(), dp.getMail());
    }
    
    public DataProveedor getProveedor(String fb_token){
    	return ip.getProveedor(fb_token);
    }
    
    public List<DataProveedor> getProveedoresSinAceptar(){
    	return ip.getProveedoresSinAceptar();
    	
    }
    
    public List<DataProveedor> getProveedores(){
    	return ip.getProveedores();
    	
    }
    
    public void aceptarProveedor(String fb_token){
    	ip.habilitarProveedor(fb_token);
    }
    
    public void rechazarProveedor(String fb_token){
    	ip.suspenderProveedor(fb_token);
    }

}
