public class Persona {

    private String Nombre;
    private String Apellido;
    private int anioNacimiento;
    
    public Persona(String nombre, String apellido, int anoNacimiento) {
        Nombre = nombre;
        Apellido = apellido;
        anioNacimiento = anoNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getanioNacimiento() {
        return anioNacimiento;
    }

    public void setanioNacimiento(int anoNacimiento) {
        anioNacimiento = anoNacimiento;
    }

    public int calcularEdad(int anioActual){
        return anioActual - anioNacimiento;
    }

    public String mostrarInfo(){
        return "";
    }
}