import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la dimensión de la matriz cuadrada
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Llamar a la función para generar y mostrar la matriz simétrica
        generarYMostrarMatrizSimetrica(dimension);

        scanner.close();
    }
    public static void generarYMostrarMatrizSimetrica(int dimension) {
        // Crear la matriz cuadrada
        int[][] matriz = new int[dimension][dimension];

        // Rellenar la matriz con números aleatorios
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = (int) (Math.random() * 101); // Números aleatorios entre 0 y 100
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Para que la matriz sea simétrica
            }
        }

        // Imprimir la matriz por pantalla
        System.out.println("La matriz simétrica generada es:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
//