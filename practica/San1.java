package practica;

public class San1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        System.out.println("Antes del intercambio");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Despues del intercambio");
        System.out.println("X vale: " + x);
        System.out.println("Y vale: " + y);

    }
}
