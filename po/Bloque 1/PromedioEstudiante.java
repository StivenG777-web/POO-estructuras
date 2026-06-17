import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota Primer Parcial (30%): ");
        double p1 = sc.nextDouble();
        System.out.print("Nota Segundo Parcial (30%): ");
        double p2 = sc.nextDouble();
        System.out.print("Nota Examen Final (40%): ");
        double ef = sc.nextDouble();

        double notaDefinitiva = (p1 * 0.30) + (p2 * 0.30) + (ef * 0.40);

        // Operador ternario para evitar estructuras de control condicionales directas
        String estado = (notaDefinitiva >= 3.0) ? "APROBADO" : "REPROBADO";

        System.out.printf("\nNota definitiva: %.2f\n", notaDefinitiva);
        System.out.println("Estado final:    " + estado);

        sc.close();
    }
}