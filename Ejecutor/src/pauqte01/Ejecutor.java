/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pauqte01;

import paquete03.Propietario;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Propietario comprador1 = new Propietario("Frasisco Vivanco", "1234567890");
        Propietario comprador2 = new Propietario("Jose Isaac", "0987654321");
        Propietario comprador3 = new Propietario("Johan Sartitama", "1122334455");

        TipoSedan sedan1 = new TipoSedan("Toyota",
                20000, 10, 500, comprador1);
        TipoSedan sedan2 = new TipoSedan("Honda",
                22000, 15, 600, comprador2);
        TipoSuv suv1 = new TipoSuv("Ford", 30000,
                10, comprador3);
        TipoCamioneta camioneta1 = new TipoCamioneta("Chevrolet",
                25000, 20, comprador1);

        Concesionaria concesionaria = new Concesionaria("Chevrolet");
        concesionaria.establecerVehiculo(sedan1);
        concesionaria.establecerVehiculo(sedan2);
        concesionaria.establecerVehiculo(suv1);
        concesionaria.establecerVehiculo(camioneta1);

        System.out.println(concesionaria);
    }

}
