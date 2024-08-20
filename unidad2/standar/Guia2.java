package unidad2.standar;

import java.util.Scanner;

public class Guia2 {
    public static void main(String[] args) {
        String nombre;

        Scanner leer=new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        nombre=leer.next();
        System.out.println("Tu nombre es " + nombre);
    }
}
