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

    public BLCliente() {
    }
    
    public void registrar(DataCliente dc){
    	ic.addCliente(dc.getFb_token(), dc.getNombre(), dc.getMail());
    }
    
    public DataCliente getCliente(String fb_token){
    	return ic.getCliente(fb_token);
    }
}
