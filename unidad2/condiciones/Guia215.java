package unidad2.condiciones;

import java.util.Scanner;

public class Guia215 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resto;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();
        resto = num1 % num2;
        if (resto == 0) {
            System.out.println(num1 + " si es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }
}
