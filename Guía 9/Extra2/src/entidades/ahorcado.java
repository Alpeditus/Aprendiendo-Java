/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
contener como atributos, un vector con la palabra a buscar, la cantidad de 
letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
package entidades;

/**
 *
 * @author Cristian
 */
public class ahorcado {
    
    private String [] buscar;
    private int cantidadDeLetras;
    private int jugadasMaximas;

    public ahorcado() {
    }

    public ahorcado(String[] buscar, int cantidadDeLetras, int jugadasMaximas) {
        this.buscar = buscar;
        this.cantidadDeLetras = cantidadDeLetras;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantidadDeLetras() {
        return cantidadDeLetras;
    }

    public void setCantidadDeLetras(int cantidadDeLetras) {
        this.cantidadDeLetras = cantidadDeLetras;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
}
