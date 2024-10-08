public class Nomina {
    private Persona persona;
    private Cargo cargo;

    public Nomina(Persona persona, Cargo cargo) {
        this.persona = persona;
        this.cargo = cargo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double generarPagos() {
        return cargo.pagar();
    }
}
