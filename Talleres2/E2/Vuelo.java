package E2;

public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    // Constructor vacío
    public Vuelo() {
        this.numero = "Sin número";
        this.origen = "Sin origen";
        this.destino = "Sin destino";
        this.ocupacion = 0;
        this.capacidadMaxima = 100; // valor por defecto
    }

    // Constructor de ruta (ocupación inicia en 0)
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
        this.capacidadMaxima = 100; // valor por defecto
    }

    // Constructor completo
    public Vuelo(String numero, String origen, String destino,
                 int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        setOcupacion(ocupacion);
    }

    // Getters
    public String getNumero() { return numero; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public int getOcupacion() { return ocupacion; }
    public int getCapacidadMaxima() { return capacidadMaxima; }

    // Setters
    public void setNumero(String numero) { this.numero = numero; }
    public void setOrigen(String origen) { this.origen = origen; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public void setOcupacion(int ocupacion) {
        if (ocupacion >= 0 && ocupacion <= capacidadMaxima) {
            this.ocupacion = ocupacion;
        } else {
            System.out.println("Error: ocupación inválida.");
        }
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Vuelo: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("---------------------------");
    }

    public void embarcar(int pasajeros) {
        if (ocupacion + pasajeros <= capacidadMaxima) {
            ocupacion += pasajeros;
            System.out.println(pasajeros + " pasajeros embarcados.");
        } else {
            System.out.println("No hay suficiente espacio disponible.");
        }
    }

    public void desembarcar(int pasajeros) {
        if (ocupacion - pasajeros >= 0) {
            ocupacion -= pasajeros;
            System.out.println(pasajeros + " pasajeros desembarcados.");
        } else {
            System.out.println("No se puede dejar la ocupación en negativo.");
        }
    }
}