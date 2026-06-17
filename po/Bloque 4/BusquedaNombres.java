import java.util.Scanner;

public class BusquedaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pacientes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }

        System.out.print("\nEscribe el nombre del paciente que deseas buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;
        
        for (int i = 0; i < pacientes.length; i++) {
            // Comparación insensible a mayúsculas/minúsculas
            if (pacientes[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Paciente localizado. Se encuentra registrado en el índice: " + i);
                encontrado = true;
                break; // Rompe la iteración al encontrar la coincidencia inicial
            }
        }

        if (!encontrado) {
            System.out.println("El paciente \"" + nombreBuscar + "\" no está en la base de datos.");
        }
        sc.close();
    }
}