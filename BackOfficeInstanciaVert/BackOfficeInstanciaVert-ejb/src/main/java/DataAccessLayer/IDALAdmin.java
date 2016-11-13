package DataAccessLayer;


import shared.DataAdmin;


public interface IDALAdmin {
	public void addAdmin(String mail,String password, String nombre);
	public void deleteAdmin(String mail);
	public DataAdmin getAdmin(String mail);
	public boolean login(String mail,String pass);
	}
