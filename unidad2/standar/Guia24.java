package unidad2.standar;

import java.util.Scanner;

public class Guia24 {
    public static void main(String[] args) {
        int edad;
        double altura;
        String nombre;

        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese su altura: ");
        altura = leer.nextDouble();
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Me llamo " + nombre + ", mido " + altura + " metros y tengo " + edad + " años");
    }
}
