package unidad2.function.recursivas;

public class Guia233 {
    public static void main(String[] args) {
        int natural = sumaNatural (4);
        System.out.println(natural);
    }

    public static int sumaNatural (int num1) {
        int num2 = 1;
        int i = 0;
        if (i <= num1) {
            num2 = sumaNatural(num1);
            num2 += 1;
            i++;
        }
        return num2;
    }
}
