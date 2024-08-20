package unidad2.operadores;

import java.util.Scanner;

public class Guia25 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número:");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado fue " + resultado);
    }
}
