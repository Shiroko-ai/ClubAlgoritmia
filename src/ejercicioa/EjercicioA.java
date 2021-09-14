/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

import java.util.Scanner;

/**
 *
 * @author ivanpalacios
 */
public class EjercicioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena = new String();
        Scanner sc = new Scanner(System.in);
        String subtotal = new String();
        int total = 0;
        int exponente = 0;
        cadena = sc.nextLine();
        StringBuilder sb = new StringBuilder(cadena);
        String cv = sb.reverse().toString();
        System.out.println(cv);
        int contador = 0;
        for (int i = 0; i < cv.length(); i++) {
            if (cv.charAt(i) == ' ' || i == cv.length() - 1) {
                for (int j = 0; j < subtotal.length(); j++) {
                    if (contador == 0) {
                        total += Integer.parseInt(String.valueOf(subtotal.charAt(contador)));
                    } else {
                        exponente = (int) Math.pow(10, contador);
                        total += Math.pow(Integer.parseInt(String.valueOf(subtotal.charAt(contador))), exponente);
                    }
                    contador++;
                }
                subtotal = "";
            } else {
                subtotal = subtotal + cv.charAt(i);
            }
        }
        System.out.println("total: " + total);
    }

}
