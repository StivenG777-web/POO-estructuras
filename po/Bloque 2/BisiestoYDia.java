import java.util.Scanner;

public class BisiestoYDia {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Evaluar año bisiesto
        System.out.print("Ingresa un año positivo: ");
        int anio = sc.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("El año " + anio + (esBisiesto ? " SÍ " : " NO ") + "es bisiesto.");

        System.out.println();

        // 2. Evaluar día de la semana
        System.out.print("Ingresa un número de día (1 al 7): ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Corresponde a: Lunes"); break;
            case 2: System.out.println("Corresponde a: Martes"); break;
            case 3: System.out.println("Corresponde a: Miércoles"); break;
            case 4: System.out.println("Corresponde a: Jueves"); break;
            case 5: System.out.println("Corresponde a: Viernes"); break;
            case 6: System.out.println("Corresponde a: Sábado"); break;
            case 7: System.out.println("Corresponde a: Domingo"); break;
            default: System.out.println("[Error] El número ingresado está fuera del rango 1-7."); break;
        }

        sc.close();
    }
}

