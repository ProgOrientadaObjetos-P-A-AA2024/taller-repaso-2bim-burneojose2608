/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqute02;

/**
 *
 * @author USUARIO
 */
public abstract class Vehiculo {
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(String x, double d) {
        marca = x;
        precioBase = d;
    }

    public abstract void calcularPrecioFinal();

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerPrecioBase(double x) {
        precioBase = x;
    }

    public void establecerPrecioFinal(double x) {
        precioFinal = x;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        return String.format("""
                             VEHICULO
                             ---------------------------------
                             
                             Marca: %s
                             Precio Base: %.2f
                             Precio Final: %.2f
                             """,
                obtenerMarca(), obtenerPrecioBase(), obtenerPrecioFinal());
    }
}
