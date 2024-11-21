/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class GestorMensajero {
    public void notificar(Mensajero mensajero, String mensaje) {
        mensajero.enviar(mensaje);
    }

    public static void main(String[] args) {
        GestorMensajero gestor = new GestorMensajero();

        Mensajero email = new Email();
        gestor.notificar(email, "Hola, este es un mensaje por email.");

        Mensajero sms = new SMS();
        gestor.notificar(sms, "Hola, este es un mensaje enviado por SMS.");

        Mensajero push = new NotificaciónesPush();
        gestor.notificar(push, "Hola, este es un mensaje enviado por push.");
    }
}
    

  

