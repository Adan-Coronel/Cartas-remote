package cartas.españolas;

public class CartasEspañolas {

    public static void main(String[] args) {

        Baraja mazo = new Baraja();
        mazo.barajar();
        mazo.cartasDisponibles();
        mazo.darCartas(41);
        mazo.cartasMonton();
        mazo.mostrarBaraja();

    }

}
