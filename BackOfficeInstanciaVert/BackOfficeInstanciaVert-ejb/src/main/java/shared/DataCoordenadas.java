package shared;

public class DataCoordenadas {

	private double lat;
    private double lng;

    public DataCoordenadas(){};
    
    public DataCoordenadas(double latitud, double longitud){
    	lat = latitud;
    	lng = longitud;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
