import java.util.ArrayList;

public class SumaMultiplosDe5 {
    public static void main(String[] args) {
        int[] multiplosDe5 = obtenerMultiplosDe5(1, 100);
        int suma = calcularSuma(multiplosDe5);
        int cantidad = multiplosDe5.length;
        System.out.println("Los múltiplos de 5 comprendidos entre 1 y 100 son:");
        for (int multiplo : multiplosDe5) {
            System.out.println(multiplo);
        }
        System.out.println("La suma de los múltiplos de 5 es: " + suma);
        System.out.println("Cantidad de múltiplos de 5: " + cantidad);
    }
    }