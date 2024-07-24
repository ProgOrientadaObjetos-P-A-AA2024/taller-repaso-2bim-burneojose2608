/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author USUARIO
 */
public class TipoSedan {
     private String marca;
    private double precioBase;
    private double precioFinal;
    private double porcetajeDesceunto;
    private double seguro;
    private Propietario propietario;

    public TipoSedan(String z, double m, double n, double g, double v, Propietario o) {
        marca = z;
        precioBase = m;
        precioFinal = n;
        porcetajeDesceunto = g;
        seguro = v;
        propietario = o;

    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerPrecioBase(double x) {
        precioBase = x;
    }

    public void establecerPrecioFinal(double x) {
        precioFinal = x;
    }

    public void establecerporcetajeDesceunto(double x) {
        porcetajeDesceunto = x;
    }

    public void establecerSeguro(double x) {
        seguro = x;
    }

    public void establecerPropietario(Propietario x) {
        propietario = x;
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

    public double obtenerporcetajeDesceunto() {
        return porcetajeDesceunto;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Marca: %s\n"
                + "Precio Base: %.2f\n"
                + "Precio Final: %.2f\n"
                + "Porcentaje Descuento: %.2f\n"
                + "Seguro: %.2f\n",
                marca,
                precioBase,
                precioFinal,
                porcetajeDesceunto,
                seguro);

        return cadena;
    }
}


