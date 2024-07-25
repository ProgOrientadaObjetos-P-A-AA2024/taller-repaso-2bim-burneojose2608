/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author USUARIO
 */
public class Propietario {
  private String nombre;
    private String cedula;

    public Propietario(String x, String n) {
        nombre = x;
        cedula = n;
    }

    public void establerNombre(String x) {
        nombre = x;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "cedula: %s\n",
                nombre,
                cedula);

        return cadena;
    }   
}
