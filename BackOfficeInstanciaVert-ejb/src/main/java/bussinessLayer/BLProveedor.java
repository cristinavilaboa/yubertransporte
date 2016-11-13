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

    /**
     * Default constructor. 
     */
    public BLProveedor() {
        // TODO Auto-generated constructor stub
    }
    
    public void registrar(DataProveedor dp){
    	ip.addProveedor(dp.getFb_token(), dp.getNombre(), dp.getMail());
    }
    
    public DataProveedor getProveedor(String fb_token){
    	//TODO agregar la llamada al dal y llamarla
    	return null;
    }
    
    public List<DataProveedor> getProveedoresSinAceptar(){
    	//TODO agregar la llamada al dal y llamarla
    	return null;
    }
    
    public void aceptarProveedor(String fb_token){
    	ip.habilitarProveedor(fb_token);
    }
    
    public void rechazarProveedor(String fb_token){
    	ip.suspenderProveedor(fb_token);
    }

}
