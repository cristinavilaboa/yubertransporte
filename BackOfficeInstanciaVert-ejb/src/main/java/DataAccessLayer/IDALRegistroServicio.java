package DataAccessLayer;

import java.util.Date;

import modelo.Review;

public interface IDALRegistroServicio {
	public void addRegistro(int registro_id,float costo,int duracion,Date fecha);//implementado
	public void addReview(int registro_id, Review review);
	public void finalizarRegistro(int registro_id,float costo,int duracion);
}
