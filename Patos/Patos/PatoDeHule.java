import ComportamientoVuelo.SinVuelo;
import ComportamientoGranznido.Chillido;
public class PatoDeHule extends Pato {
    public PatoDeHule() {
        comportamientoVuelo = new SinVuelo();       // no puede volar
        comportamientoDeGraznido = new Chillido();  // sonido tipo pito
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de hule amarillo.");
    }
}
