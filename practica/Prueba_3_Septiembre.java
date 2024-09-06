package practica;

public class Prueba_3_Septiembre {
    public static void main(String[] args) {
        int suma = sumaPrimos(1, 10);
        System.out.println(suma);
    }

    public static int sumaPrimos(int min, int max) {
        int suma = 0;
        if (1 <= min && min <= max) {
            for (int i = min; i <= max; i++) {
                if (esPrimo(i)) {
                    suma += i;
                }
            }
        }
        return suma;
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
