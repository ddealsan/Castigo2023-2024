import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la dimensión de la matriz cuadrada
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Llamar a la función para generar y mostrar la matriz simétrica
        generarYMostrarMatrizSimetrica(dimension);

        scanner.close();
    }
