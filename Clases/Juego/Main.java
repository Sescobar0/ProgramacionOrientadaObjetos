import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del jugador 1: ");
        Personaje p1 = new Personaje(sc.nextLine(), new AtaqueBasico());

        System.out.print("Nombre del jugador 2: ");
        Personaje p2 = new Personaje(sc.nextLine(), new AtaqueBasico());

        JuegoLucha juego = new JuegoLucha(p1, p2);
        juego.iniciarPelea();
    }
}
