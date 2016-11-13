package DataAccessLayer;

import modelo.Review;
import shared.DataRegistroServicio;

public interface IDALRegistroServicio {
	public int addRegistro(DataRegistroServicio registro);//implementado
	public void addReview(int registro_id, Review review);
	public void finalizarRegistro(int registro_id,float costo,int duracion);
}
