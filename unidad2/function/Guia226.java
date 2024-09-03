package unidad2.function;

public class Guia226 {
    public static void main(String[] args) {
        double area = areaCirculo(7.4,2);
        System.out.println(area);
    }

    public static double areaCirculo(double radio, int exponente) {
        double j = radio;
        for (int i = 1; i < exponente; i++) {
            j *= radio;
        }
        return Math.PI * j;
    }
}
