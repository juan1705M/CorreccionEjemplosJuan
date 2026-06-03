public class Programador implements TrabajoPresencial,
TrabajoRemoto,
Desarrollo {

    @Override
    public void trabajarEnOficina() {
        System.out.println("Programando en oficina");
    }

    @Override
    public void trabajarRemoto() {
        System.out.println("Programando desde casa");
    }

    @Override
    public void escribirCodigo() {
        System.out.println("Escribiendo código");
    }
}
