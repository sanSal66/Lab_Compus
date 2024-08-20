package unidad2.mixto;

import java.util.Scanner;

public class Guia220 {
    public static void main(String[] args) {
        int num1;
        int suma = 0;
        int contador = 0;
        double promedio;
        int cantidad = 10;

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un valor:");
            num1 = leer.nextInt();
            if (num1 % 2 == 0 ) {
                suma += num1;
                contador++;
            }
        }
        promedio = (double) suma / contador;
        System.out.println("El promedio de los numeros pares fue " + promedio);
    }
}
