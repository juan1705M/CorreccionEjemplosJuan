import ComportamientoGranznido.Quack;
import ComportamientoVuelo.bareto;

public class PatoVendedorDeRosas extends Pato {
    public PatoVendedorDeRosas() {
        comportamientoVuelo = new bareto();       
        comportamientoDeGraznido = new Quack();    
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato doméstico de granja.");
    }
}
