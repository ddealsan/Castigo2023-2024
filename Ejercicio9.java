import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de los vectores
        System.out.print("Introduce la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        // Crear los vectores
        int[] vector1 = obtenerVector(scanner, dimension);
        int[] vector2 = obtenerVector(scanner, dimension);

        // Calcular y mostrar el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }
    public static int[] obtenerVector(Scanner scanner, int dimension) {
        int[] vector = new int[dimension];
        System.out.println("Introduce los elementos del vector (separados por espacios):");
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma dimensión");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}