public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 123456789, 417, true);

        // Consultar la disponibilidad del libro
        libro1.consultarDisponibilidad();

        // Prestar el libro
        libro1.prestar();
        
        // Intentar prestar el libro nuevamente (debería indicar que ya está prestado)
        libro1.prestar();

        // Devolver el libro
        libro1.devolver();

        // Consultar la disponibilidad del libro después de devolverlo
        libro1.consultarDisponibilidad();

        // Intentar devolver el libro nuevamente (debería indicar que no estaba prestado)
        libro1.devolver();
    }
}