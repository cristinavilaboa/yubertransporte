package bussinessLayer;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALServicio;
import DataAccessLayer.DALServicio_Normal;
import DataAccessLayer.DALServicio_Urgente;
import DataAccessLayer.IDALServicio;
import DataAccessLayer.IDALServicio_Normal;
import DataAccessLayer.IDALServicio_Urgente;
import shared.DataServicio;

/**
 * Session Bean implementation class BLServices
 */
@Stateless
@LocalBean
public class BLServices {
	
	private IDALServicio is = new DALServicio();
	private IDALServicio_Normal isn = new DALServicio_Normal();
	private IDALServicio_Urgente isu = new DALServicio_Urgente();

    /**
     * Default constructor. 
     */
    public BLServices() {
        // TODO Auto-generated constructor stub
    }
    
    public void setDatos(DataServicio dt){
    	//TODO agregar la operacion a servicio y llamarla
    }
    
    public DataServicio getDatos(){
    	//TODO agregar la operacion a dalservicio y llamarla
    	return null;
    }
    
    public int solicitarUrgente(String fb_token){
    	//TODO agregar operacion a dalurgente y llamrla
    	return 0;
    }
    

    public int solicitarNormal(String fb_token){
    	//TODO agregar operacion a dalnormal y llamrla
    	return 0;
    }
    
    public void iniciar(int idservice, Date fecha){
    	//TODO agregar operacion a dalservicio y llamrla
    }
    
    public float finalizar (int idservice, Date fecha, float km){
    	//TODO agregar operacion a dalservicio y llamarla
    	return 0;
    }
}
