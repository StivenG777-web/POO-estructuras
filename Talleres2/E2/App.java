package E2;

public class App {
    public static void main(String[] args) {

        
        Vuelo vuelo1 = new Vuelo();
        vuelo1.mostrarInfo();

       
        Vuelo vuelo2 = new Vuelo("AV9401", "Bogotá", "Medellín");
        vuelo2.mostrarInfo();

        
        Vuelo vuelo3 = new Vuelo("LA200", "Cali", "Cartagena", 50, 120);
        vuelo3.mostrarInfo();

        
        vuelo3.embarcar(40);
        vuelo3.desembarcar(30);
        vuelo3.mostrarInfo();
    }
}