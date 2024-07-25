/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pauqte01;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;
import paqute02.Vehiculo;

public class Concesionaria {

    private String nombre;
    private List<Vehiculo> vehiculos;
    private double ventasTotales;

    public Concesionaria(String x) {
        nombre = x;

    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerVehiculos(List<Vehiculo> x) {
        vehiculos = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    public void establecerVehiculo(Vehiculo x) {
        vehiculos.add(x);
    }

    public void establecerVentasTotales() {
        double totalVentas = 0;
        for (Vehiculo vehiculo : vehiculos) {
            totalVentas = totalVentas + vehiculo.obtenerPrecioFinal();
        }
    }

    public double ventasTotales() {
        return ventasTotales;
    }

    public Vehiculo vehiculoMasCaro() {
        if (vehiculos.isEmpty()) {
            return null;
        }
        Vehiculo masCaro = vehiculos.get(0);
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.obtenerPrecioFinal() > masCaro.obtenerPrecioFinal()) {
                masCaro = vehiculo;
            }
        }
        return masCaro;
    }

    public Vehiculo vehiculoMasBarato() {
        if (vehiculos.isEmpty()) {
            return null;
        }
        Vehiculo masBarato = vehiculos.get(0);
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.obtenerPrecioFinal() < masBarato.obtenerPrecioFinal()) {
                masBarato = vehiculo;
            }
        }
        return masBarato;
    }

    @Override
    public String toString() {
        return String.format("""
                Concesionaria[
                Nombre: %s
                Ventas Totales: %.2f
                Vehículo Más Caro: %s
                Vehículo Más Barato: %s
                
                """,
                nombre, ventasTotales(),
                vehiculoMasCaro(), vehiculoMasBarato());
    }
}
