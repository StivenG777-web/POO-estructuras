package E1;

public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", true);
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", true);

        libro1.mostrarInfo();
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        System.out.println();

        libro2.mostrarInfo();
        libro2.prestar();
        libro2.devolver();
    }
}