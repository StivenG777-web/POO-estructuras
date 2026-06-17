import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Genera número aleatorio del 1 al 100
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int contadorIntentos = 0;

        System.out.println("¡He pensado un número secreto entre 1 y 100! Intenta adivinarlo.");

        while (intento != numeroSecreto) {
            contadorIntentos++;
            System.out.print("Intento " + contadorIntentos + ": ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("→ El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("→ El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + contadorIntentos + " intentos.");
            }
        }
        sc.close();
    }
}