package E3;

public class App {

    public static void main(String[] args) {

        DepositoAgua deposito1 = new DepositoAgua(100);
        DepositoAgua deposito2 = new DepositoAgua(50);

        // Conectar el desbordamiento del primero al segundo
        deposito1.setDepositoDesborde(deposito2);

        System.out.println("Estado inicial:");
        deposito1.mostrarEstado();
        deposito2.mostrarEstado();

        System.out.println("Agregando 130 litros al depósito 1...");
        deposito1.agregarAgua(130);

        System.out.println("\nEstado final:");
        System.out.println("Depósito 1:");
        deposito1.mostrarEstado();

        System.out.println("Depósito 2:");
        deposito2.mostrarEstado();

        System.out.println("Quitando 20 litros del depósito 2...");
        deposito2.quitarAgua(20);

        System.out.println("\nEstado final después de quitar agua:");
        deposito2.mostrarEstado();
    }
}