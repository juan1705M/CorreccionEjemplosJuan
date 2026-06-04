import ComportamientoGranznido.Quack;
import ComportamientoVuelo.VolarConAlas;

public class PatoMallard extends Pato {
    public PatoMallard(){
        comportamientoVuelo = new VolarConAlas();
        comportamientoDeGraznido = new Quack();
    }
    @Override
    public void dibujar(){
        System.out.println("Soy un pato mallard");
    }
}