package unidad2.function;

import java.util.Scanner;

public class Guia224 {
    public static void main(String[] args) {
        double resultadoPotencia = potencia(2, 2);
        System.out.println(resultadoPotencia);
    }

    public static double potencia(double base, int exponente) {
        double j = base;
        for (int i = 1; i < exponente; i++)
            j *= base;
        System.out.println("La potencia de " + base + " elevado a la " + exponente + " es:");
        return j;
    }
}
