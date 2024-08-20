package unidad2.buclesimple;

import java.util.Scanner;

public class Guia211 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        double resultado;
        int i = 0;
        int j;

        Scanner leer=new Scanner(System.in);
        System.out.println("¿Cuantos números quiere promediar?");
        num3= leer.nextInt();
        j = num3 - 1;
        System.out.println("Ingrese un número: ");
        num2= leer.nextInt();
        while (i < j) {
            System.out.println("Ingrese un número: ");
            num1 = leer.nextInt();
            num2 = num2 + num1;
            i++;
        }
        resultado= num2 / num3;
        System.out.println("El promedio fue " + resultado);
    }
}
