package cartas.españolas;

import java.util.ArrayList;


public class Baraja {
    private ArrayList<Carta> cartas;
    private int cantCartasEntregadas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas= new ArrayList<Carta>();

        cantCartasEntregadas=0;
        llenarMazo();
        monton= new ArrayList<Carta>();
    }
    
    public void llenarMazo(){};
    
    public void barajar(){};
    
    public Carta siguienteCarta(){
    //agregar return
    };
   
    public void cartasDisponibles(){};
    
    
    public ArrayList<Carta> darCartas(){
     //agregar return
    };
    
    public void cartasMonton(){
         System.out.println("El montón tiene " + cantCartasEntregadas + " cartas");
        monton.forEach((carta) -> {
            System.out.println(monton.indexOf(carta) + " - " + carta.toString());
        });
    };
    
    public void mostrarBaraja(){
        System.out.println("La baraja es: ");
        baraja.forEach((carta) -> {
            System.out.println(baraja.indexOf(carta) + " - " + carta.toString());
        });
    };
    
}
