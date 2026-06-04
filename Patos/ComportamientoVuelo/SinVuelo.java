package ComportamientoVuelo;
import Interface.ComportamientoVuelo;

public class SinVuelo implements ComportamientoVuelo {
    public void volar(){
        System.out.println("No puedo volar.");
    }
}
