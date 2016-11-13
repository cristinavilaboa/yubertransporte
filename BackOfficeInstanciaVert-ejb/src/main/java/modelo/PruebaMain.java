package modelo;

import DataAccessLayer.DALAdmin;
import DataAccessLayer.DALRegistroServicio;

public class PruebaMain {
	public static void main(String[] args){
		DALAdmin a = new DALAdmin();
		a.addAdmin("Prueba", "Prueba", "pruebaa");
	//	DALRegistroServicio rs = new DALRegistroServicio();
		
	}
}
