public class Libro {
    // Atributos de la clase
    private String titulo;
    private String autor;
    private int ISBN;
    private int numeroPagina;
    private boolean disponibilidad; // true si está disponible, false si está prestado

    // Método constructor de la clase
    public Libro(String titulo, String autor, int ISBN, int numeroPagina, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPagina = numeroPagina;
        this.disponibilidad = disponibilidad;
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        if (!disponibilidad) {
            disponibilidad = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    // Método para consultar la disponibilidad del libro
    public boolean estaDisponible() {
        return disponibilidad;
    }

    // Método para consultar la disponibilidad y mostrar el estado
    public void consultarDisponibilidad() {
        if (estaDisponible()) {
            System.out.println("El libro '" + titulo + "' está disponible.");
        } else {
            System.out.println("El libro '" + titulo + "' está prestado.");
        }
    }
}
