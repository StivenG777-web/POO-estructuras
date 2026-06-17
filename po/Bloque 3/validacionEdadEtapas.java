import java.util.Scanner;

public class validacionEdadEtapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;

        // Validación de datos limpia
        while (true) {
            System.out.print("Digita tu edad (Rango válido 1 a 120): ");
            edad = sc.nextInt();

            if (edad >= 1 && edad <= 120) {
                break; // Rompe el bucle infinito solo si cumple la restricción
            }
            System.out.println("[Error] La edad no pertenece a un rango humano válido.\n");
        }

        // Estructura de clasificación
        String etapa;
        if (edad <= 12) {
            etapa = "Niñez";
        } else if (edad <= 17) {
            etapa = "Adolescencia";
        } else if (edad <= 25) {
            etapa = "Juventud";
        } else if (edad <= 59) {
            etapa = "Adultez";
        } else {
            etapa = "Tercera edad";
        }

        System.out.println("\nProcesamiento Exitoso.");
        System.out.println("Tu etapa de vida determinada es: " + etapa);

        sc.close();
    }
}