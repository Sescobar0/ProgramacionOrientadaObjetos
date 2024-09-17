public class Profesor extends Persona{
    
    private String profesion;

    public Profesor(String Nombre, String Apellido, int anioNacimiento, String profesion){
        super(Nombre, Apellido, anioNacimiento);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public String mostrarInfo(){
        return "Estudiante: [ Nombre:" + getNombre() +" " 
        + getApellido() + " Año de Nacimiento : " + getanioNacimiento() 
        +" Profesion: " + profesion + "]";
    }



}
