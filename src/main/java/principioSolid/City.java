package principioSolid;


public class City {
    
    private String ciudad;
    
    public City(String ciudad){
        
        this.ciudad = ciudad;
    }
    
    public void setCiudad(String ciudad){
        
        this.ciudad = ciudad;
    }
    
    public String getCiudad(){
        
        return ciudad;
    }
}
