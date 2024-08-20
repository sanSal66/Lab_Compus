package unidad2.condiciones;

import java.util.Scanner;

public class Guia212 {
    public static void main(String[] args) {
        int num1;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        if (num1 > 10){
            System.out.println("El número ingresado es mayor que 10");
        }
    }
}
