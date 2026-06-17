package E1;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacío
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.disponible = true; // por defecto disponible
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        this.autor = autor;
        this.disponible = true; // por defecto disponible
    }

    // Constructor completo
    public Libro(String titulo, String autor, boolean disponible) {
        setTitulo(titulo);
        this.autor = autor;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: el título no puede estar vacío.");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
        System.out.println("---------------------------");
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado correctamente.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto correctamente.");
        System.out.println("---------------------------");
    }
}