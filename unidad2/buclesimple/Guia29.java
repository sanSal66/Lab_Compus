package unidad2.buclesimple;

import java.util.Scanner;

public class Guia29 {
    public static void main(String[] args) {
        int i = 0;
        int num1;

        Scanner leer=new Scanner(System.in);
        System.out.println("¿Cuantas veces quieres imprimir el numero 10?");
        num1 = leer.nextInt();
        while (i < num1) {
            System.out.println("10");
            i++;
        }
    }
}
