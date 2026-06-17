package E1;

public class App {
    public static void main(String[] args) {

        
        Libro libro1 = new Libro();
        libro1.mostrarInfo();

        
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libro2.mostrarInfo();

        
        Libro libro3 = new Libro("Don Quijote", "Miguel de Cervantes", false);
        libro3.mostrarInfo();
    }
}