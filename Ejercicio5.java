public class TablasDeMultiplicar {
    public static void main(String[] args) {
        // Definir el número de tablas de multiplicar a generar
        int n = 10;
        int[][] tablas = generarTablasDeMultiplicar(n);

        // Visualizar las tablas de multiplicar por pantalla
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }