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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeImportacion;
    private double valorImportacion;
    private double seguroMantenimiento;
    private Propietario propietario;

    public TipoCamioneta(String x, double d, double c, Propietario a) {
        super(x, d);
        porcentajeImportacion = c;
        propietario = a;

    }

    @Override
    public void calcularPrecioFinal() {
        valorImportacion = precioBase * porcentajeImportacion / 100;
        seguroMantenimiento = valorImportacion * 1.5;
        precioFinal = precioBase + valorImportacion + seguroMantenimiento;
    }

    public void establecerPorcentajeImportacion(double x) {
        porcentajeImportacion = x;
    }

    public void establecerPropietario(Propietario x) {
        propietario = x;
    }

    public double obtenerPorcentajeImportacion() {
        return porcentajeImportacion;
    }

    public double obtenerValorImportacion() {
        return valorImportacion;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return String.format("""
                TipoCamioneta[
                Marca: %s
                Precio Base: %.2f
                Precio Final: %.2f
                Porcentaje Importacion: %.2f
                Valor Importacion: %.2f
                Seguro Mantenimiento: %.2f
                Propietario: %s
                ]
                """,
                marca, precioBase,
                precioFinal, porcentajeImportacion,
                valorImportacion, seguroMantenimiento, propietario);
    }
}
