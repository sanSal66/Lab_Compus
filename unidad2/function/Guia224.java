package unidad2.function;

import java.util.Scanner;

public class Guia224 {
    public static void main(String[] args) {
        double resultadoPotencia = potencia(3, 4);
        System.out.println(resultadoPotencia);
    }

    public static double potencia(double base, int exponente) {
        double j = base;
        for (int i = 1; i < exponente; i++) {
            j = j * base;
        }
        return j;
    }
}
