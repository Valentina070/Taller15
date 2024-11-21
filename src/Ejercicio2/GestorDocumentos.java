/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class GestorDocumentos {
   public void documentar(Documento documento, String mensaje) {
        documento.exportar(mensaje); 
   }
      public static void main(String[] args) {
   
      GestorDocumentos gestor = new GestorDocumentos();

        Documento pdf = new PDF();
        gestor.documentar(pdf, "EXPORTANDO DOCUMETO PDF");

        Documento word = new Word();
        gestor.documentar(word, "EXPORTANDO DOCUMENTO WORD");
      }
}
