package Entidades;

/**
 *
 * @author Cristian
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    @Override
    public void Alimentarse() {
        super.Alimentarse();         
        
    }    
}
