package principioSolid;

public class Land extends Vehicle{
    
    private short type;
    private City city;
    
    public Land(int power, int year, String brand, short type, City city){
        super(power, year, brand);
        
        this.type = type;
        this.city = city;
    }
    
    
    public String descripcion(){
        String descripcionLand = "Este vehículo tiene una fuerza de: " + power + ", es del año: " + year + ", su marca es:"
                + brand + ", su tipo es: " + type + " y pertenece a la ciudad: " + city;
        
        return descripcionLand;
    }
    
    public String moveWhlees(){
        
        return "";
    }
    
    public String moveWJetPropulsion(){
        
        return "";
    }
}
