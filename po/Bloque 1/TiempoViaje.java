import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de minutos totales: ");
        int minutosTotales = sc.nextInt();

        // Conversiones usando división entera y módulo
        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        long segundosTotales = (long) minutosTotales * 60;

        System.out.println("\nTiempo ingresado: " + minutosTotales + " minutos");
        System.out.printf("Equivale a:       %d horas, %d minutos, 0 segundos\n", horas, minutosRestantes);
        System.out.println("En segundos:      " + segundosTotales + " segundos");

        sc.close();
    }
}