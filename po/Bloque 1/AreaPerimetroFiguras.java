import java.util.Scanner;

public class AreaPerimetroFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del rectángulo
        System.out.print("Base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Datos del círculo
        System.out.print("Radio del círculo: ");
        double radio = sc.nextDouble();

        // Cálculos
        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);
        
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        // Resultados
        System.out.println("\n--- RESULTADOS RECTÁNGULO ---");
        System.out.printf("Área:      %.2f\n", areaRectangulo);
        System.out.printf("Perímetro: %.2f\n", perimetroRectangulo);

        System.out.println("\n--- RESULTADOS CÍRCULO ---");
        System.out.printf("Área:           %.2f\n", areaCirculo);
        System.out.printf("Circunferencia: %.2f\n", circunferencia);

        sc.close();
    }
}