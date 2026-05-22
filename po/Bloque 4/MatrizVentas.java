import java.util.Scanner;

public class MatrizVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] ventas = new double[4][3]; // 4 sucursales x 3 productos

        // Captura de datos
        for (int f = 0; f < 4; f++) {
            System.out.println("--- SUCURSAL " + (f + 1) + " ---");
            for (int c = 0; c < 3; c++) {
                System.out.print("Venta Producto " + (c + 1) + ": $ ");
                ventas[f][c] = sc.nextDouble();
            }
        }

        // 1. Calcular sumas por sucursal (Filas)
        System.out.println("\n--- Ventas por sucursal ---");
        for (int f = 0; f < 4; f++) {
            double totalFila = 0;
            for (int c = 0; c < 3; c++) {
                totalFila += ventas[f][c];
            }
            System.out.printf("Sucursal %d: $ %.2f\n", (f + 1), totalFila);
        }

        // 2. Calcular sumas por producto (Columnas)
        System.out.println("\n--- Ventas por producto ---");
        for (int c = 0; c < 3; c++) {
            double totalColumna = 0;
            for (int f = 0; f < 4; f++) {
                totalColumna += ventas[f][c];
            }
            System.out.printf("Producto %d: $ %.2f\n", (c + 1), totalColumna);
        }

        // 3. Ubicar valor máximo global
        double maximaVenta = ventas[0][0];
        int filaMax = 0, colMax = 0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                if (ventas[f][c] > maximaVenta) {
                    maximaVenta = ventas[f][c];
                    filaMax = f;
                    colMax = c;
                }
            }
        }

        System.out.printf("\nVenta más alta: $ %.2f (Sucursal %d, Producto %d)\n", 
                maximaVenta, (filaMax + 1), (colMax + 1));

        sc.close();
    }
}