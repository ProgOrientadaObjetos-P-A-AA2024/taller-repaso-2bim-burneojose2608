/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pauqte01;

import paquete03.Propietario;
import paqute02.Vehiculo;

/**
 *
 * @author USUARIO
 */
public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double seguro;
    private Propietario propietario;

    public TipoSedan(String x, double d, double f, double m, Propietario g) {
        super(x, d);
        porcentajeDescuento = f;
        seguro = m;
        propietario = g;

    }

    @Override
    public void calcularPrecioFinal() {
        double valorDescuento = precioBase * porcentajeDescuento / 100;
        double seguroMecanico = precioBase * 0.01;
        precioFinal = precioBase - valorDescuento + seguroMecanico + seguro;
    }

    public void establecerPorcentajeDescuento(double x) {
        porcentajeDescuento = x;
    }

    public void establecerSeguro(double x) {
        seguro = x;
    }

    public void establecerPropietario(Propietario x) {
        propietario = x;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return String.format("""
                TipoSedan
                Marca: %s
                Precio Base: %.2f
                Precio Final: %.2f
                Porcentaje Descuento: %.2f
                Seguro: %.2f
                Propietario: %s
                
                """,
                marca, precioBase,
                precioFinal, porcentajeDescuento,
                seguro, propietario);
    }
}
