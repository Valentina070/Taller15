/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        double precio = 45999.90;
     
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(35);
        System.out.println("El descuento por porcentaje es: " + descuentoPorcentaje.calcularDescuento(precio));
 
        Descuento descuento = new DescuentoTotal(10000);
        System.out.println("El descuento fijo del producto es: " + descuento.calcularDescuento(precio));
    }
}

