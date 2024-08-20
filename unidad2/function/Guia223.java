package unidad2.function;

public class Guia223 {
    public static void main(String[] args) {
        boolean resultado = sonIguales(1, 4, 2);
        System.out.println(resultado);
    }

    public static boolean sonIguales(int num1, int num2, int tolerancia ) {
        boolean resultado;
        
        resultado = (num1 - num2) <= tolerancia && (num1 - num2) >= -tolerancia;
        return resultado;
    }
}
