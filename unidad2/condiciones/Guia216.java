package unidad2.condiciones;

import java.util.Scanner;

public class Guia216 {
    public static void main(String[] args) {
        int num1;
        int resultado = 0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número para saber su valor absoluto:");
        num1 = leer.nextInt();
        if (num1 >= 0) {
            resultado = num1;
        } else {
            resultado = num1 * (-1);
        }
        System.out.println("El valor absoluto de " + num1 + " es " + resultado);
    }
}
