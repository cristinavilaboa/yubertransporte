package DataAccessLayer;

public interface IDALServicio_Urgente {
	public void addServicio_Urgente(float tarifa, int tiempo_aceptacion, String descripcion, String nombre, int tiempo_respuesta, float costo_adicional);
	public void modificarTiempoAceptacion(int servicio_id,int tiempo_aceptacion);//implementado
	public void modificarTiempoRespuesta(int servicio_id,int tiempo_respuesta);//implementado
	public void modificarTarifa(int servicio_id,float tarifa);//implementado
	public void modificarCostoextra(int servicio_id,float costo_extra);//implementado
	
	
}
