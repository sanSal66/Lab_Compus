package practica;

import java.util.Scanner;

public class Tomi1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int one;
        System.out.println("Ingrese un numero:");
        one = leer.nextInt();
        int suma = suma(one,2);
        System.out.println("El resultado de la suma es:");
        System.out.println(suma);
        double extra;
    }

    public static int suma(int one,int two){
        return one + two;
    }
}
