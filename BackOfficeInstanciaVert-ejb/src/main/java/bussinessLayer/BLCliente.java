package bussinessLayer;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALCliente;
import DataAccessLayer.IDALCliente;
import shared.DataCliente;

/**
 * Session Bean implementation class BLCliente
 */
@Stateless
@LocalBean
public class BLCliente {
	
	private IDALCliente ic = new DALCliente();

    /**
     * Default constructor. 
     */
    public BLCliente() {
        // TODO Auto-generated constructor stub
    }
    
    public void registrar(DataCliente dc){
    	ic.addCliente(dc.getFb_token(), dc.getNombre(), dc.getMail());
    }
    
    public DataCliente getCliente(String fb_token){
    	//TODO agregar la operacion al dal y llamarla de aca
    	return null;
    }
}
