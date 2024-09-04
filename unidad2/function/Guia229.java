package unidad2.function;

public class Guia229 {
    public static void main(String[] args) {
        int suma = sumaPrimos(2, 5);
        System.out.println(suma);
    }

    public static int sumaPrimos(int min, int max) {
        int j = 0;
        if (1 < min && min < max) {
            for (int i = min; i < max; i++) {
                boolean primo = esPrimo(i);
                if (primo) {
                    j += i;
                }
            }
        }
        return j;
    }

    public static boolean esPrimo (int i) {
        if (i % 2 == 0)
            return false; // falso
        for(int j = 3; j * j <= i;j += 2) {
            if(i % j == 0) // falso
                return false;
        }
        return true; // verdadero
    }
}
