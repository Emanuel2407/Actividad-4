package principioSolid;
import interfaces.*;

public class Amphibian extends Vehicle implements WatherVehicle, Engine{
    
    private String type;
    
        public Amphibian(int power, int year, String brand, short type){
            super(power, year, brand);
        }
        
        public String pathPrograming(){
            
            return "";
        }
        
        public String descripcion(){
        
            return "";
        }
        
        public String moveWheels(){
        
            return "";
        }
    
        public String moveJetPropulsion(){
        
            return "";
        }
        
            
}
