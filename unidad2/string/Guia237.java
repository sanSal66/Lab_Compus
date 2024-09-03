package unidad2.string;

import java.util.Scanner;

public class Guia237 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nueva letra:");
        String carac0 = leer.next();
        System.out.println("Vieja letra:");
        String carac1 = leer.next();
        String cadena = "Hola mundo";
        String hola = reemplazo(cadena, carac0, carac1);
        System.out.println("La palabra final es: " + hola);
    }

    public static String reemplazo(String cadena, String carac0, String carac1) {
        char cambio = carac1.charAt(0);
        String salida = "";

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == cambio) {
                salida += carac1;
                cadena.substring(i + 1, cadena.length());
            } else {
                salida += cadena.charAt(i);
            }
        }
        return salida;
    }
}
