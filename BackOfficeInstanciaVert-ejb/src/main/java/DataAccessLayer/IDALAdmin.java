package DataAccessLayer;

import javax.ejb.Local;

@Local
public interface IDALAdmin {
	public String addAdmin(String mail,String password, String nombre);
	

	
}
