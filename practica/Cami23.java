package practica;

public class Cami23 {
    public static void main(String[] args) {
        boolean comparacion = sonIguales (-2, 3, 4);
        System.out.println(comparacion);

        int suma = suma(2, 4);
        System.out.println(suma);

        String hola = holaMundo();
        System.out.println(hola);
    }

    public static boolean sonIguales (int nuno, int ndos, int tole) {
        boolean entero;
        entero = (nuno - ndos) <= tole && (nuno - ndos) >= -tole;
        return entero;
    }

    public static int suma (int one, int two) {
        int resultado = one + two;
        return resultado;
    }

    public static String holaMundo () {
        return "Hola mundo";
    }
}
