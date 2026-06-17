
import java.util.Scanner;
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- TIPOS DE VEHÍCULO ---");
        System.out.println("1. Moto\n2. Carro\n3. Camioneta");
        System.out.print("Selecciona una opción: ");
        int tipo = sc.nextInt();

        System.out.print("Horas de permanencia: ");
        int horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Error: El tiempo de permanencia debe ser superior a 0 horas.");
        } else {
            int totalPagar = 0;
            boolean valido = true;

            switch (tipo) {
                case 1:
                    totalPagar = 2000 + (horas - 1) * 1500;
                    break;
                case 2:
                    totalPagar = 4000 + (horas - 1) * 3000;
                    break;
                case 3:
                    totalPagar = 5000 + (horas - 1) * 4000;
                    break;
                default:
                    System.out.println("Error: Tipo de vehículo no reconocido.");
                    valido = false;
                    break;
            }

            if (valido) {
                System.out.println("\n-----------------------------");
                System.out.println("Total a pagar por taquilla: $ " + totalPagar);
            }
        }
        sc.close();
    }

    

