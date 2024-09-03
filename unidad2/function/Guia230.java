package unidad2.function;

public class Guia230 {
    public static void main(String[] args) {
        int binario = deBinarioADecimal("11");
        System.out.println (binario);
    }

    public static int deBinarioADecimal (String binario) {
        return Integer.parseInt(binario, 2);
    }
}
