import java.util.Scanner;

public class PrimosRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Límite inferior (a): ");
        int a = sc.nextInt();
        System.out.print("Límite superior (b): ");
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Error: 'a' debe ser estrictamente menor que 'b'.");
        } else {
            int cantidadPrimos = 0;
            int sumaPrimos = 0;
            StringBuilder primosEncontrados = new StringBuilder();

            System.out.print("\nPrimos entre " + a + " y " + b + ": ");

            for (int i = a; i <= b; i++) {
                if (i < 2) continue; // Los números menores a 2 no se consideran primos

                boolean esPrimo = true;
                int divisor = 2;
                int limiteRaiz = (int) Math.sqrt(i);

                // Ciclo alternativo de chequeo de divisibilidad optimizado
                while (divisor <= limiteRaiz) {
                    if (i % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                    divisor++;
                }

                if (esPrimo) {
                    if (cantidadPrimos > 0) {
                        primosEncontrados.append(", ");
                    }
                    primosEncontrados.append(i);
                    cantidadPrimos++;
                    sumaPrimos += i;
                }
            }

            System.out.println(primosEncontrados);
            System.out.println("Cantidad: " + cantidadPrimos);
            System.out.println("Suma: " + sumaPrimos);
        }
        sc.close();
    }
}
