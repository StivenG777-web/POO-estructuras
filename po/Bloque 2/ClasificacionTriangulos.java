import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();

        // 1. Teorema de la desigualdad triangular
        boolean esValido = (l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1);

        if (esValido) {
            System.out.print("El triángulo es válido y es: ");
            // 2. Clasificación
            if (l1 == l2 && l2 == l3) {
                System.out.println("EQUILÁTERO");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("ISÓSCELES");
            } else {
                System.out.println("ESCALENO");
            }
        } else {
            System.out.println("Error: Las longitudes ingresadas no forman un triángulo válido.");
        }

        sc.close();
    }
}