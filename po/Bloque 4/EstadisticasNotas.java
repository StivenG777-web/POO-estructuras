import java.util.Scanner;

public class EstadisticasNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double suma = 0;

        // Lectura de notas
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa la nota del estudiante " + (i + 1) + " (0.0 a 5.0): ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / 10;
        
        // Búsqueda de extremos estadísticos
        double maxNota = notas[0]; int posMax = 0;
        double minNota = notas[0]; int posMin = 0;
        int aprobados = 0; int reprobados = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
                posMax = i;
            }
            if (notas[i] < minNota) {
                minNota = notas[i];
                posMin = i;
            }
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Reporte
        System.out.printf("\nPromedio del grupo: %.2f\n", promedio);
        System.out.printf("Nota más alta:      %.1f (Posición de índice [%d])\n", maxNota, posMax);
        System.out.printf("Nota más baja:      %.1f (Posición de índice [%d])\n", minNota, posMin);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        sc.close();
    }
}