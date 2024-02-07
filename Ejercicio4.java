import java.util.Scanner;

public class Ejercicio4 {
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
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }

        // Verificar si se introdujeron números positivos
        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se han introducido números positivos.");
        } else {
            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        }

        scanner.close();
    }
}