import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Descomponer el número en factores primos
        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Imprimir los factores primos
        System.out.print(numero + " = ");
        for (int i = 0; i < factoresPrimos.size(); i++) {
            System.out.print(factoresPrimos.get(i));
            if (i < factoresPrimos.size() - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }

    // Función para descomponer un número en factores primos
    public static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;

        while (numero > 1) {
            while (numero % divisor == 0) {
                factoresPrimos.add(divisor);
                numero /= divisor;
            }
            divisor++;
        }

        return factoresPrimos;
    }
}