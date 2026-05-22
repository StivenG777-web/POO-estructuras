import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        
        // Inicializar tablero con espacios en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) tablero[i][j] = ' ';
        }

        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int jugadas = 0;

        while (!juegoTerminado) {
            // Imprimir estado del tablero
            System.out.println("\n Tablero:");
            for (int i = 0; i < 3; i++) {
                System.out.printf(" %c | %c | %c \n", tablero[i][0], tablero[i][1], tablero[i][2]);
                if (i < 2) System.out.println("-----------");
            }

            // Solicitar movimiento
            System.out.printf("\nTurno de '%c'.\n", jugadorActual);
            System.out.print("Fila (0-2): ");
            int fila = sc.nextInt();
            System.out.print("Columna (0-2): ");
            int col = sc.nextInt();

            // Validación de coordenadas y espacio vacío
            if (fila < 0 || fila > 2 || col < 0 || col > 2 || tablero[fila][col] != ' ') {
                System.out.println("[Error] Movimiento inválido. Inténtalo de nuevo.");
                continue;
            }

            // Registrar jugada
            tablero[fila][col] = jugadorActual;
            jugadas++;

            // Verificar si hay ganador
            boolean gano = false;
            for (int i = 0; i < 3; i++) {
                // Filas y Columnas
                if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                    (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                    gano = true;
                }
            }
            // Diagonales
            if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                gano = true;
            }

            if (gano) {
                System.out.printf("\n¡El jugador '%c' ha ganado la partida!\n", jugadorActual);
                juegoTerminado = true;
            } else if (jugadas == 9) {
                System.out.println("\n¡Empate! El tablero está completo.");
                juegoTerminado = true;
            } else {
                // Alternancia de turno por operación condicional directa
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }
        sc.close();
    }
}