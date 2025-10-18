import java.util.Random;

public class AtaqueBasico implements EstrategiaAtaque {
    @Override
    public int calcularDano() {
        Random rand = new Random();
        return rand.nextInt((30 - 10) + 1) + 10; // daño entre 10 y 30
    }
}
