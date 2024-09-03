package unidad2.string;

import java.util.Scanner;

public class Guia236 {
    public static void main(String[] args) {
        int contadorDePalabras = 1;
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        cadena = leer.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (conteo(cadena.charAt(i))) {
                contadorDePalabras++;
            }
        }
        System.out.println("La cantidad de palabras era de " + contadorDePalabras);
    }

    public static boolean conteo(char palabra) {
        return palabra == ' ';
    }
}
