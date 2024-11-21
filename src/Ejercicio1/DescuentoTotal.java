/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class DescuentoTotal extends Descuento{
double cantidad;

public DescuentoTotal(double cantidad){
    this.cantidad=cantidad;
}
    @Override
    public double calcularDescuento(double precio) {
    return cantidad;
    }
}