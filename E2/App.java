package E2;

public class App {
    public static void main(String[] args) {

        Vuelo vuelo1 = new Vuelo(
                "AV9401",
                "Bogotá",
                "Medellín",
                80,
                100);

        Vuelo vuelo2 = new Vuelo(
                "LA200",
                "Cali",
                "Cartagena",
                50,
                120);

        vuelo1.mostrarInfo();
        vuelo1.embarcar(15);
        vuelo1.embarcar(20);
        vuelo1.desembarcar(30);

        System.out.println();

        vuelo2.mostrarInfo();
        vuelo2.embarcar(40);
        vuelo2.desembarcar(100);
    }
}