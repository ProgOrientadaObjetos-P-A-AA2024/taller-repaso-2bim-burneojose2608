/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author USUARIO
 */
public abstract class Concesionaria {
protected Propietario propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Concesionaria(Propietario p, String m, double pb, double pf) {
        propietario = p;
        marca = m;
        precioBase = pb;
        precioFinal = pf;
    }
    
    public abstract void calcularPrecioFinal();

    public void establecerPropietario(Propietario pro) {
        propietario = pro;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecioBase(double pb) {
        precioBase = pb;
    }

    public void establecerPrecioFinal() {
       
    }

public Propietario obtenerPropietario() {
        return propietario;
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
                             Propietario: 
                             Marca: %s
                             Precio Base: %.2f
                             Precio Final: %.2f
                             """,
                obtenerPropietario(),obtenerMarca(),obtenerPrecioBase(),
                obtenerPrecioFinal());
    }


}
