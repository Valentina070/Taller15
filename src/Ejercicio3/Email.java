/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class Email extends Mensajero{
@Override
public void enviar(String mensaje) {
System.out.println("Enviando email: " + mensaje);
}
}