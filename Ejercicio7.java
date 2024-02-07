import java.util.Scanner;
import java.util.ArrayList;

public class FactoresPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Descomponer el número en factores primos
        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Imprimir los factores primos
        System.out.print(numero + " = ");