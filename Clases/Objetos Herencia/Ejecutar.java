public class Ejecutar{
    public static void main(String[] args) {
        
        final int ANIO_ACTUAL=2024;

        // Creacion de Objetos
        Persona objP1 = new Estudiante("Cristiano", "Ronaldo ", 1990, 264532);
        Persona objP2 = new Estudiante("Lionel", "Messi", 1991, 345621);

        Persona objP3 = new Profesor("Carlo", "Anchelotti", 1960, "Tecnico");
        Persona objP4 = new Profesor("Nestor", "Lorenzo", 1970, "Preparador");
        
        System.out.println(objP1.calcularEdad(ANIO_ACTUAL));
        System.out.println(objP3.calcularEdad(ANIO_ACTUAL));
        
        System.out.println(objP2.mostrarInfo());
        System.out.println(objP4.mostrarInfo());


        // Creacion de un arreglo de Personas(Objetos)
        Persona[] p = new Persona[4];

        p[0] = objP1;
        p[1] = objP2;
        p[2] = objP3;
        p[3] = objP4;

        for(int i = 0; i < p.length; i++){
            System.out.println(p[i].calcularEdad(ANIO_ACTUAL) + " - " + p[i].mostrarInfo());
        }

    }
}