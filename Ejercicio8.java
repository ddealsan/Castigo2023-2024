import java.util.Scanner;

public class EstadisticasArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir números enteros hasta que se introduzca un 0
        int[] numeros = recibirNumeros(scanner);

        // Calcular la media, el mínimo y el máximo de los datos introducidos
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        // Mostrar resultados
        System.out.println("La media de los números introducidos es: " + media);
        System.out.println("El mínimo de los números introducidos es: " + minimo);
        System.out.println("El máximo de los números introducidos es: " + maximo);

        scanner.close();
    }

    // Función para recibir N números enteros por teclado hasta que se introduzca un 0
    public static int[] recibirNumeros(Scanner scanner) {
        System.out.println("Introduce números enteros (introduce 0 para terminar):");
        int[] numeros = new int[100]; // Se asume un límite de 100 números
        int indice = 0;

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros[indice] = numero;
            indice++;
        }

        // Ajustar el tamaño del array según la cantidad de números introducidos
        int[] resultado = new int[indice];
        System.arraycopy(numeros, 0, resultado, 0, indice);
        return resultado;
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }
}