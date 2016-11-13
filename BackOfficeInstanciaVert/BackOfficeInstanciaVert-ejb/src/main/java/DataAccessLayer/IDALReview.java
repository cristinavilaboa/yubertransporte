package DataAccessLayer;

public interface IDALReview {
	public void addReview();
	public void addReviewDeCliente(int review_id,int puntaje_cliente,String comentario_cliente);
	public void addReviewDeProveedor(int review_id,int puntaje_proveedor,String comentario_proveedor);
	
}
