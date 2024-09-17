public class Estudiante extends Persona{
    
    private int id;

    public Estudiante(String Nombre, String Apellido, int anioNacimiento, int id){
        super(Nombre, Apellido, anioNacimiento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String mostrarInfo(){
        return "Estudiante: [ Nombre:" + getNombre() +" " 
        + getApellido() + "Año de Nacimiento : " + getanioNacimiento() 
        +"id: " + id + "]";
    }

}
