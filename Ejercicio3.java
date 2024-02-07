import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Obtener todos los múltiplos de 5 entre 1 y 100
        int[] multiplosDe5 = obtenerMultiplosDe5(1, 100);

        // Calcular la suma de los múltiplos de 5
        int suma = calcularSuma(multiplosDe5);

        // Contar cuántos hay
        int cantidad = multiplosDe5.length;

        // Mostrar cada uno de los múltiplos de 5
        System.out.println("Los múltiplos de 5 comprendidos entre 1 y 100 son:");
        for (int multiplo : multiplosDe5) {
            System.out.println(multiplo);
        }

        // Mostrar la suma de los múltiplos de 5
        System.out.println("La suma de los múltiplos de 5 es: " + suma);

        // Mostrar la cantidad de múltiplos de 5
        System.out.println("Cantidad de múltiplos de 5: " + cantidad);
    }

    // Función para obtener los múltiplos de 5 entre begin y end
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }
        // Convertir ArrayList a array
        int[] result = new int[multiplos.size()];
        for (int i = 0; i < multiplos.size(); i++) {
            result[i] = multiplos.get(i);
        }
        return result;
    }

    // Función para calcular la suma de los elementos de un array
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}