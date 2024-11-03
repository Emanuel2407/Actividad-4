package principioSolid;


public abstract class Vehicle {
    
    protected int power;
    protected int year;
    protected String brand;
    
    public Vehicle(){
        
    }
    
    public Vehicle(int power, int year, String brand){
        
        this.power = power;
        this.year = year;
        this.brand = brand;
        
    }
    
    public abstract String descripcion();
    
    
}
