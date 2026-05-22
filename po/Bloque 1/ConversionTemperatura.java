import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // Aplicación de fórmulas
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;

        // Impresión con formato alineado y dos decimales
        System.out.printf("\nCelsius:    %.2f °C\n", celsius);
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K\n", kelvin);

        sc.close();
    }
}