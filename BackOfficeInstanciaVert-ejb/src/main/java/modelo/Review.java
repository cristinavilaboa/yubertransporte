package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import shared.DataReview;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private int review_id;
	
	//datos del cliente
	private int puntaje_cliente;
	private String comentario_cliente;
	
	//datos del proveedor
	private int puntaje_proveedor;
	private String comentario_proveedor;
	
	public Review(){}

	public Review(int puntaje_cliente, String comentario_cliente, int puntaje_proveedor, String comentario_proveedor) {
		super();
		this.puntaje_cliente = puntaje_cliente;
		this.comentario_cliente = comentario_cliente;
		this.puntaje_proveedor = puntaje_proveedor;
		this.comentario_proveedor = comentario_proveedor;
	}

	public Review(DataReview dr) {
		super();
		this.puntaje_cliente = dr.getPuntaje_cliente();
		this.comentario_cliente = dr.getComentario_cliente();
		this.puntaje_proveedor = dr.getPuntaje_proveedor();
		this.comentario_proveedor = dr.getComentario_proveedor();
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

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	
}
