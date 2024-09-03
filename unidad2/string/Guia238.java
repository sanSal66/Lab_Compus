package unidad2.string;

import java.util.Scanner;

public class Guia238 {
    public static void main(String[] args) {
        int contadorDeVocales = 0;
        String cadena;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena de texto");
        cadena = ent.nextLine();
        System.out.println(cadena);
        System.out.println(cadena.length());

        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                contadorDeVocales++;
            }
        }
        System.out.println("La cantidad de vocales es " + contadorDeVocales);
    }

    public  static boolean esVocal(char caracter) {
        return switch (caracter) {
            case 'a','e','i','o','u' -> true;
            default -> false;
        };
    }
}
