package DataAccessLayer;

import java.util.List;

import shared.DataServicio;

public interface IDALServicio {
	
	public DataServicio getServicio(int serviceid);
	public List<DataServicio> getAllServicios();
	
}
