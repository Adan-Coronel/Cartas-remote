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
    
    public void cartasMonton(){};
    
    public void mostrarBaraja(){};
    
}
