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
public class TipoSuv extends Vehiculo {

    private double porcentajeSeguroPersonas;
    private double seguroPersonas;
    private Propietario propietario;

    public TipoSuv(String x, double d, double f, Propietario g) {
        super(x, d);
        porcentajeSeguroPersonas = f;
        propietario = g;

    }

    @Override
    public void calcularPrecioFinal() {
        seguroPersonas = precioBase * porcentajeSeguroPersonas / 100;
        precioFinal = precioBase + seguroPersonas;
    }

    public void establecerPorcentajeSeguroPersonas(double x) {
        porcentajeSeguroPersonas = x;
    }

    public void establecerPropietario(Propietario x) {
        propietario = x;
    }

    public double obtenerPorcentajeSeguroPersonas() {
        return porcentajeSeguroPersonas;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return String.format("""
                TipoSuv
                Marca: %s
                Precio Base: %.2f
                Precio Final: %.2f
                Porcentaje Seguro Personas: %.2f
                Seguro Personas: %.2f
                Propietario: %s
                
                """,
                marca, precioBase, precioFinal,
                porcentajeSeguroPersonas,
                seguroPersonas, propietario);
    }
}
