package unidad2.operadores;

import java.util.Scanner;

public class Guia26 {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número: ");
        num2 = leer.nextInt();
        num2 = num1 / num2;
        System.out.println("El cociente fue de " + num2);
    }
}
