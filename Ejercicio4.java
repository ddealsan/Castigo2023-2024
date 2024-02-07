import java.util.Scanner;

public class MinMaxListaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de números enteros positivos. Introduce un número negativo para terminar.");

        // Variables para almacenar el mínimo y el máximo
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            // Verificar si el número es negativo para finalizar
            if (numero < 0) {
                break;
            }