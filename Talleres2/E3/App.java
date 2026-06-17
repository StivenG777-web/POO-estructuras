package E3;

public class App {

    public static void main(String[] args) {

        
        DepositoAgua deposito1 = new DepositoAgua();
        deposito1.mostrarEstado();

        
        DepositoAgua deposito2 = new DepositoAgua(80);
        deposito2.mostrarEstado();

        
        DepositoAgua deposito3 = new DepositoAgua(100, 50);
        deposito3.mostrarEstado();

        
        deposito3.setDepositoDesborde(deposito2);

        System.out.println("Agregando 70 litros al depósito 3...");
        deposito3.agregarAgua(70);

        System.out.println("\nEstado final:");
        System.out.println("Depósito 3:");
        deposito3.mostrarEstado();

        System.out.println("Depósito 2:");
        deposito2.mostrarEstado();
    }
}