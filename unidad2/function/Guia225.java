package unidad2.function;

import static java.lang.Math.random;

public class Guia225 {
    public static void main(String[] args) {
        double aleatorio = enteroAleatorio(4, 10);
        System.out.println(aleatorio);
    }

    public static double enteroAleatorio(int min, int max) {
        double random = Math.random();
        if (min < random) {
            if (random < max) return random;
        }
        return random;
    }
}
