package E3;

public class DepositoAgua {

    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    // Constructor vacío
    public DepositoAgua() {
        this.capacidad = 100;   // valor por defecto
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    // Constructor con capacidad
    public DepositoAgua(double capacidad) {
        setCapacidad(capacidad);
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    // Constructor completo
    public DepositoAgua(double capacidad, double volumenActual) {
        setCapacidad(capacidad);
        if (volumenActual >= 0 && volumenActual <= capacidad) {
            this.volumenActual = volumenActual;
        } else {
            System.out.println("Error: volumen inicial inválido. Se asigna 0.");
            this.volumenActual = 0;
        }
        this.depositoDesborde = null;
    }

    // Getters
    public double getCapacidad() { return capacidad; }
    public double getVolumenActual() { return volumenActual; }
    public DepositoAgua getDepositoDesborde() { return depositoDesborde; }

    // Setters
    public void setCapacidad(double capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("La capacidad debe ser mayor que cero.");
        }
    }

    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    // Métodos
    public void mostrarEstado() {
        double espacioLibre = capacidad - volumenActual;
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen actual: " + volumenActual);
        System.out.println("Espacio libre: " + espacioLibre);
        System.out.println("---------------------------");
    }

    public void agregarAgua(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return;
        }

        volumenActual += cantidad;

        if (volumenActual > capacidad) {
            double sobrante = volumenActual - capacidad;
            volumenActual = capacidad;
            System.out.println("Se produjo desbordamiento de " + sobrante + " litros.");

            if (depositoDesborde != null) {
                depositoDesborde.agregarAgua(sobrante);
            } else {
                System.out.println("No existe depósito de desborde. El agua sobrante no tiene destino.");
            }
        }
    }

    public void quitarAgua(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return;
        }

        if (cantidad > volumenActual) {
            System.out.println("No hay suficiente agua. El depósito queda vacío.");
            volumenActual = 0;
        } else {
            volumenActual -= cantidad;
        }
    }
}