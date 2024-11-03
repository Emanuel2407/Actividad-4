/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principioSolid;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Vista {
    
    static Scanner input = new Scanner(System.in);
    static City objCity;
    static Land objLand;
    

    public static void main(String[] args) {
        
        LandVehicle();
    }

    private static void LandVehicle() {
        
        System.out.println("Ingrese el power de su vehículo");
        int power = input.nextInt();
        
        System.out.println("Ingrese el year de su vehículo");
        int year = input.nextInt();
        
        System.out.println("Ingrese la brand de su vehículo");
        String brand = input.next();
        
        System.out.println("Ingrese el tipo de su vehículo");
        short type = input.nextShort();
        
        System.out.println("Ingrese la ciudad de su vehículo");    
        String ciudad = input.next();
        
        objCity = new City(ciudad);
        
        objLand = new Land(power, year, brand, type, objCity.getCiudad());
        
        System.out.println("La descripción de este vehículo es: " + objLand.descripcion());
  
    }
}
