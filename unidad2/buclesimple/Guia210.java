package unidad2.buclesimple;

import java.util.Scanner;

public class Guia210 {
    public static void main(String[] args) {
        int num1;
        int num2;
        double resultado;
        int i = 0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num2 = leer.nextInt();
        while (i < 6) {
            System.out.println("Ingrese un número: ");
            num1 = leer.nextInt();
            num2 += num1;
            i++;
        }
        resultado= num2 / 7;
        System.out.println("El promedio fue " + resultado);
    }
}
