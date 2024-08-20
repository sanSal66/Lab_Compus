package unidad2.mixto;

import java.util.Scanner;

public class Guia217 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int i = 0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        while (i < 10) {
            System.out.println("Ingrese otro número:");
            num2 = leer.nextInt();
            if (num1 < num2) {
                num1 = num2;
            }
            i++;
        }
        System.out.println("El mayor número fue " + num1);
    }
}
