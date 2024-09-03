package unidad2.function.recursivas;

import java.util.Scanner;

public class Guia235 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1;
        int suma = sumaDigitos (num1 = leer.nextInt());

        System.out.println (suma);
    }

    public static int sumaDigitos (int num1) {
        if (num1 < 10) {
            return num1;
        } else {
            return sumaDigitos (num1 / 10);
        }
    }
}
