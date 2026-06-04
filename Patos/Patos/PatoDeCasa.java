import ComportamientoVuelo.SinVuelo;
import ComportamientoGranznido.Quack;

public class PatoDeCasa extends Pato {
    public PatoDeCasa() {
        comportamientoVuelo = new SinVuelo();       // pato doméstico no vuela
        comportamientoDeGraznido = new Quack();     // sonido clásico
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato doméstico de granja.");
    }
}
