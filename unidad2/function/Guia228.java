package unidad2.function;

public class Guia228 {
    public static void main(String[] args) {
        int grande = max (10, 20);
        System.out.println("El valor mas grande fue " + grande);
    }

    public static int max (int num1, int num2) {
        if (num1 < num2)
            num1 = num2;
        return num1;
    }
}
