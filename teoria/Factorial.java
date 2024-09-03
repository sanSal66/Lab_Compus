package teoria;

public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println("El resultado es " + factorial);
    }

    public static int factorial (int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
