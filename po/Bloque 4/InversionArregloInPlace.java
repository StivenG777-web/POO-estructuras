import java.util.Scanner;

public class InversionArregloInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño del arreglo (n de 1 a 20): ");
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Tamaño fuera de los límites.");
        } else {
            int[] arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Elemento [" + i + "]: ");
                arreglo[i] = sc.nextInt();
            }

            // Impresión original
            System.out.print("\nOriginal:  ");
            for (int elemento : arreglo) System.out.print(elemento + "  ");

            // Algoritmo de mutación in-place (intercambio simétrico)
            for (int i = 0; i < n / 2; i++) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[n - 1 - i];
                arreglo[n - 1 - i] = aux;
            }

            // Impresión invertido
            System.out.print("\nInvertido: ");
            for (int elemento : arreglo) System.out.print(elemento + "  ");
            System.out.println();
        }
        sc.close();
    }
}