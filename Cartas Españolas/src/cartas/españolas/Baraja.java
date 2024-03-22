package cartas.españolas;

import java.util.ArrayList;
import java.util.Collections;


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
    
    public void llenarMazo(){
    
        for (int i = 0; i < 10; i++) {
            
            if(i==8){
                cartas.add(new Carta("Espada", 12));
                cartas.add(new Carta("Oro", 12));
                cartas.add(new Carta("Basto", 12));
                cartas.add(new Carta("Copa", 12));
            }
            else if(i==9){
                cartas.add(new Carta("Espada", 11));
                cartas.add(new Carta("Oro", 11));
                cartas.add(new Carta("Basto", 11));
                cartas.add(new Carta("Copa", 11));            
            }
            
            else{
                cartas.add(new Carta("Espada", i));
                cartas.add(new Carta("Oro", i));
                cartas.add(new Carta("Basto", i));
                cartas.add(new Carta("Copa", i));
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    };
    
    public Carta siguienteCarta(){
    //agregar return
    };
   
    public void cartasDisponibles(){
        System.out.println("Hay " + (40 - cantCartasEntregadas) + " cartas disponibles");
    };
    
    
    public ArrayList<Carta> darCartas(int cantCartas){
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        if (cantCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas para entregarte :(");
            return cartasDadas;
        }
    };
    
    public void cartasMonton(){
         System.out.println("El montón tiene " + cantCartasEntregadas + " cartas");
        monton.forEach((carta) -> {
            System.out.println(monton.indexOf(carta) + " - " + carta.toString());
        });
    };
    
    public void mostrarBaraja(){
        System.out.println("La baraja es: ");
        cartas.forEach((carta) -> {
            System.out.println(cartas.indexOf(carta) + " - " + carta.toString());
        });
    };
    
}
