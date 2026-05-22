import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el límite 'n' para calcular las series: ");
        int n = sc.nextInt();

        int sumaNaturales = 0;
        int sumaPares = 0;
        int sumaCuadrados = 0;

        // Cálculos mediante ciclos
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
            sumaPares += (2 * i);
            sumaCuadrados += (i * i);
        }

        // Comprobaciones mediante fórmulas matemáticas cerradas
        int formulaNaturales = (n * (n + 1)) / 2;
        int formulaPares = n * (n + 1);
        int formulaCuadrados = (n * (n + 1) * (2 * n + 1)) / 6;

        System.out.println("\n--- RESULTADOS COMPARTIDOS ---");
        System.out.printf("1. Naturales: Ciclo = %d | Fórmula = %d (%s)\n", 
                sumaNaturales, formulaNaturales, (sumaNaturales == formulaNaturales ? "OK" : "ERROR"));
        System.out.printf("2. Pares:     Ciclo = %d | Fórmula = %d (%s)\n", 
                sumaPares, formulaPares, (sumaPares == formulaPares ? "OK" : "ERROR"));
        System.out.printf("3. Cuadrados: Ciclo = %d | Fórmula = %d (%s)\n", 
                sumaCuadrados, formulaCuadrados, (sumaCuadrados == formulaCuadrados ? "OK" : "ERROR"));

        sc.close();
    }
}