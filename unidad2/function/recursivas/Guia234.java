package unidad2.function.recursivas;

import java.util.Scanner;

public class Guia234 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número:");
        int fibo = fibonacci (num1 = leer.nextInt());

        System.out.println ("El número de serie fue " + fibo);
    }

    public static int fibonacci (int num1) {
        int resultado = 0;

        if (num1 == 0)
            return 0;

        if (num1 == 1)
            return 1;

        if (num1 > 1) {
            resultado = fibonacci (num1 - 1) + fibonacci (num1 - 2);
        }
        return resultado;
    }
}
