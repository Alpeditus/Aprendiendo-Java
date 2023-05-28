package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Juego {
    
    private ArrayList<Jugador>jugadoress;
    private Revolver revolver;
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.jugadoress = jugadores;
        this.revolver = r;
    }
    
    public void ronda(){
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            jugadoress.get(cont);
            if (revolver.mojar()) {
                System.out.println(jugadoress.get(cont) + " ha perdido.");
                break;
            }else{
                System.out.println(jugadoress.get(cont) + " sazó.");
                revolver.siguienteChorro();
            }
            cont++;
            if (cont==jugadoress.size()) {
                cont=0;
            }
        }
    }
}
