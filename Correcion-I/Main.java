public class Main {

    public static void main(String[] args) {

        Programador programador = new Programador();
        JefeDeSoporte jefe = new JefeDeSoporte();

        programador.trabajarEnOficina();
        programador.trabajarRemoto();
        programador.escribirCodigo();

        System.out.println("-------------------");

        jefe.trabajarEnOficina();
        jefe.gestionarEquipo();
        jefe.atenderClientes();
    }
}
