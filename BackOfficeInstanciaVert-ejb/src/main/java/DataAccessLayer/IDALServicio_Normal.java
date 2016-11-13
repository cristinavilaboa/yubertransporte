package DataAccessLayer;

public interface IDALServicio_Normal {
	public void addServicio_Normal(float tarifa, int tiempo_aceptacion, String descripcion, String nombre); //implementado
	public void modificarTiempoAceptacion(int servicio_id,int tiempo_aceptacion);//implementado
	public void modificarTarifa(int servicio_id,float tarifa);//implementado
}
