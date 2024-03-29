public class Ejercicio6 {
    public static void main(String[] args) {
        // Definir la cantidad de números primos que se desean encontrar
        int N = 10;

        // Obtener los N primeros números primos
        int[] primos = obtenerPrimerosNPrimos(N);
        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
    public static int[] obtenerPrimerosNPrimos(int N) {
        int[] primos = new int[N];
        int count = 0;
        int num = 2; // Comenzamos desde el primer número primo

        while (count < N) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        return primos;
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}