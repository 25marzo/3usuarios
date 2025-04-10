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
 //Recorremos la cadena caracter a caracter
        for (int x = 0; x < cadena.length(); x++) {
            //Comprobamos si la letra es una vocal (pasamos a minúsculas todas las letras)
            switch(cadena.toLowerCase().charAt(x)){
                //Si dejamos casos abiertos sin break en cualquiera de los que 
                //entre realizará lo del último que tiene break (u)
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': contador++; 
                          break;                    
            }
        } 

        System.out.println("La palabra "+cadena+" contiene "+contador+" vocales.");
    }
}