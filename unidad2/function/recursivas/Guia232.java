package unidad2.function.recursivas;

public class Guia232 {
    public static void main(String[] args) {
        int factorial = factorial(4);
        int recursivo = factRecursivo(4);
        System.out.println("El resultado es " + recursivo );
    }

    public static int factorial (int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int factRecursivo (int n) {
        if (n > 1) {
            return factRecursivo(n - 1) * n;
        } else {
            return 1;
        }
    }
}
