package bussinessLayer;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALServicio_Normal;
import DataAccessLayer.DALServicio_Urgente;
import DataAccessLayer.IDALServicio_Normal;
import DataAccessLayer.IDALServicio_Urgente;

/**
 * Session Bean implementation class BLRates
 */
@Stateless
@LocalBean
public class BLRates {
	private IDALServicio_Normal isn = new DALServicio_Normal();
	private IDALServicio_Urgente isu = new DALServicio_Urgente();

    /**
     * Default constructor. 
     */
    public BLRates() {
        // TODO Auto-generated constructor stub
    }
    
    public float getNormalRate(){
    	//TODO agregar operacion de obtener tarifa o servicio al dal y llamarlo
    	return 0;
    }
    
    public void setNormalRate(float rate, int serviceid){
    	isn.modificarTarifa(serviceid, rate);
    }
    
    public float getExtra(){
    	//TODO agregar operacion de obtener tarifa o servicio al dal y llamarlo
    	return 0;
    }
    
    public void setExtra(float rate, int serviceid){
    	isu.modificarTarifa(serviceid, rate);
    }

}
