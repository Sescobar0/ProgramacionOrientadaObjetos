public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", 30, "Calle 5ta");
        Cargo c1 = new Consultor(2000, 5.0);
        Nomina n1 = new Nomina(p1, c1);

        Persona p2 = new Persona("Ana", "Gomez", 25, "Avenida Ciudad de Cali");
        Cargo c2 = new Operario(10, 30);
        Nomina n2 = new Nomina(p2, c2);

        System.out.println(p1.getNombre() + " " + p1.getApellido() + " - Pago: " + n1.generarPagos());
        System.out.println(p2.getNombre() + " " + p2.getApellido() + " - Pago: " + n2.generarPagos());
    }
}
