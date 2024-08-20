package unidad2.mixto;

import java.util.Scanner;

public class Guia219 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int i = 0;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        num1 = leer.nextInt();
        while (i < 15) {
            System.out.println("Ingrese otro valor:");
            num2 = leer.nextInt();
            if (num1 > num2)
                num1 = num2;
            i++;
        }
        System.out.println("El menor valor ingresado es " + num1);
    }
}
