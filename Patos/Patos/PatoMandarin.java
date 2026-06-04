import ComportamientoVuelo.VolarConAlas;
import ComportamientoGranznido.Quack;

public class PatoMandarin extends Pato {
    public PatoMandarin() {
        comportamientoVuelo = new VolarConAlas();   // este pato sí vuela
        comportamientoDeGraznido = new Quack();     // sonido clásico
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato mandarín con colores brillantes.");
    }
}
