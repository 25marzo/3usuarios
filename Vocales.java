/*
 * Solicita al usuario una cadena y comprueba el número de vocales que tiene.
 */
package programacionbasica;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        String cadena = "";
        int contador = 0; //Contador de vocales

        //Solicita al usuario una palabra teclado y lo almacena en la variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        cadena = sc.nextLine();
        sc.close();
//añadir codigo
//CUANDO SE VA AÑADIR ??
        System.out.println("La palabra "+cadena+" contiene "+contador+" vocales.");
    }
}