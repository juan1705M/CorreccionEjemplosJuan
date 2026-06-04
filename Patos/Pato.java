import Interface.ComportamientoDeGraznido;
import Interface.ComportamientoVuelo;

public abstract class Pato {

    protected ComportamientoVuelo comportamientoVuelo;
    protected ComportamientoDeGraznido comportamientoDeGraznido;

    public void nadar(){
        System.out.println("Todos los patos ");
    }

    public  abstract void dibujar();
    
    public void hacerQuack(){
        comportamientoDeGraznido.quack();
    }

    public void emprenderVuelo(){
        comportamientoVuelo.volar();
    }

    public void establecerComportamientoVuelo(ComportamientoVuelo cv){
        this.comportamientoVuelo = cv;
    }

    public void establecerComportamientoDeGraznido(ComportamientoDeGraznido cv){
        this.comportamientoDeGraznido = cv;
    }
}