package bussinessLayer;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALAdmin;
import DataAccessLayer.IDALAdmin;
import shared.DataAdmin;

/**
 * Session Bean implementation class SLAdmin
 */
@Stateless
@LocalBean
public class BLAdmin {

	private IDALAdmin ia = new DALAdmin();
    /**
     * Default constructor. 
     */
    public BLAdmin() {
        // TODO Auto-generated constructor stub
    }
    
    public void addAdmin(DataAdmin da){
    	ia.addAdmin(da.getMail(), da.getPassword(), da.getNombre());
    }
    
   public void deleteAdmin(String mail){
    	ia.deleteAdmin(mail);
    	//TODO agregar operacion al dal y llamarla
    }
    
    public boolean login(String mail, String pass){
    	return ia.login(mail, pass);
    	//TODO agregar operacion para obtener admin al dal y llamarla
    	
    }
    public DataAdmin getAdmin(String mail){
    	return ia.getAdmin(mail);
    }
    
}
