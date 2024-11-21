/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class PDF extends Documento {
 @Override
    public void exportar(String mensaje) {
        System.out.println("Exportación PDF: " + mensaje);
    }
    
}
