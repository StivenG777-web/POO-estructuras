import java.util.Scanner;

public class CalculadoraIMC {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso en kilogramos (ej. 75,4): ");
        double peso = sc.nextDouble();

        System.out.print("Estatura en metros (ej. 1,75): ");
        double estatura = sc.nextDouble();

        double imc = peso / Math.pow(estatura, 2);
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc <= 24.9) {
            categoria = "Peso normal";
        } else if (imc <= 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.printf("\nSu IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);

        sc.close();
    }
}

