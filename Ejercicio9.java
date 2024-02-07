import java.util.Scanner;

public class ProductoEscalar {
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