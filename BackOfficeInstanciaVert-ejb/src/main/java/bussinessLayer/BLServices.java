package bussinessLayer;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import DataAccessLayer.DALRegistroServicio;
import DataAccessLayer.DALServicio;
import DataAccessLayer.DALServicio_Normal;
import DataAccessLayer.IDALRegistroServicio;
import DataAccessLayer.IDALServicio;
import DataAccessLayer.IDALServicio_Normal;
import shared.DataCoordenadas;
import shared.DataRegistroServicio;
import shared.DataServicio;

/**
 * Session Bean implementation class BLServices
 */
@Stateless
@LocalBean
public class BLServices {
	
	private IDALServicio is = new DALServicio();
	private IDALServicio_Normal isn = new DALServicio_Normal();
	//private IDALServicio_Urgente isu = new DALServicio_Urgente();
	private IDALRegistroServicio irg = new DALRegistroServicio();
	private Map<String, DataCoordenadas> proveedores_conectados = new HashMap<String, DataCoordenadas>();

    public BLServices() {
    }
    
    public int addService(DataServicio dt){
    	return isn.addServicio_Normal(dt.getTarifa(), dt.getTiempo_aceptacion(), dt.getDescripcion(), dt.getNombre());
    }
    
    public DataServicio getServicio(int serviceid){
    	return is.getServicio(serviceid);
    }
    
    public List<DataServicio> getAllServicios(){
    	return is.getAllServicios();
    }
    
    public int solicitarUrgente(String fb_token, double longitud, double latitud){
    	DataRegistroServicio drs= new DataRegistroServicio(0,0, new Date(),null, new DataCoordenadas(latitud, longitud), null);
    	int id = irg.addRegistro(drs);
    	//TODO agregar la logica de buscar el proveedor mas cercano y ver como hablar
    	return id;
    }
    

    public void buscarProveedor(double latitud, double longitud){
    	//todo en otro hilo con timeout segun normal o urgente
    	//Tomo lista de proveedores conectados y la guardo
    	//la recorro y me quedo con el mas cercano
    	//hago el post a google para mandarle a ese proveedor la notificacion del viaje
    	//semaforo me tranca
    	//me fijo si el proveedor acepto notifico al cliente y retorno
    	//si no me acepto arranco de nuevo
    	//en el caso de timeout notifico al cliente que no hay proveedores
    }
	
	 public void agregarUbicacion(String idproveedor, double latitud, double longitud){
    	proveedores_conectados.put(idproveedor, new DataCoordenadas(latitud, longitud));
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
