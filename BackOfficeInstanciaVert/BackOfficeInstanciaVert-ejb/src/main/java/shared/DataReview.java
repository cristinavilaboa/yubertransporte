package shared;

import modelo.Review;

public class DataReview {
	
	//datos del cliente
	private int puntaje_cliente;
	private String comentario_cliente;
	
	//datos del proveedor
	private int puntaje_proveedor;
	private String comentario_proveedor;
	
	public DataReview(){}

	public DataReview(int puntaje_cliente, String comentario_cliente, int puntaje_proveedor, String comentario_proveedor) {
		super();
		this.puntaje_cliente = puntaje_cliente;
		this.comentario_cliente = comentario_cliente;
		this.puntaje_proveedor = puntaje_proveedor;
		this.comentario_proveedor = comentario_proveedor;
	}
	
	public DataReview(Review r) {
		super();
		this.puntaje_cliente = r.getPuntaje_cliente();
		this.comentario_cliente = r.getComentario_cliente();
		this.puntaje_proveedor = r.getPuntaje_proveedor();
		this.comentario_proveedor = r.getComentario_proveedor();
	}

	public int getPuntaje_cliente() {
		return puntaje_cliente;
	}

	public void setPuntaje_cliente(int puntaje_cliente) {
		this.puntaje_cliente = puntaje_cliente;
	}

	public String getComentario_cliente() {
		return comentario_cliente;
	}

	public void setComentario_cliente(String comentario_cliente) {
		this.comentario_cliente = comentario_cliente;
	}

	public int getPuntaje_proveedor() {
		return puntaje_proveedor;
	}

	public void setPuntaje_proveedor(int puntaje_proveedor) {
		this.puntaje_proveedor = puntaje_proveedor;
	}

	public String getComentario_proveedor() {
		return comentario_proveedor;
	}

	public void setComentario_proveedor(String comentario_proveedor) {
		this.comentario_proveedor = comentario_proveedor;
	}
}
