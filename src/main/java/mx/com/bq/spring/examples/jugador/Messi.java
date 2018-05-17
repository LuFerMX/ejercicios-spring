package mx.com.bq.spring.examples.jugador;

import mx.com.bq.spring.examples.equipo.Barcelona;
import mx.com.bq.spring.examples.equipo.IEquipo;
import mx.com.bq.spring.examples.equipo.Juventus;

public class Messi {

    // Fuertemente ligado 
    // Barcelona barcelona = new Barcelona();

    // Sigue teniendo una fuerte dependencia 
    //private Barcelona barcelona;
    
    private IEquipo equipo;
    
    public Messi(IEquipo equipo) {
        this.equipo = equipo;
    }
    /*
    public void setBarcelona(Barcelona bar) {
        this.barcelona = bar;
    }
    */
    public void mostrarEquipo() {
        equipo.mostrar();
    }


    public static void main(String[] args) {
        // Inyección de dependencia por constructor 
        Messi m = new Messi(new Barcelona());
        // Inyección de dependencia por setter 
        //m.setBarcelona(new Barcelona());
        m.mostrarEquipo();
        
        Messi m2 = new Messi(new Juventus());
        m2.mostrarEquipo();
        
    }    
}
