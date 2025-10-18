public class Personaje {
    private String nombre;
    private int puntosDeVida;
    private EstrategiaAtaque estrategia;

    public Personaje(String nombre, EstrategiaAtaque estrategia) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.estrategia = estrategia;
    }

    public void atacar(Personaje oponente) {
        int dano = estrategia.calcularDano();
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        if (puntosDeVida < 0) puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
