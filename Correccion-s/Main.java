public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Carlos Pérez",
                "carlos@gmail.com",
                150);

        CarnetCliente carnet = new CarnetCliente();
        ServicioCorreo correo = new ServicioCorreo();
        ReportePuntos reporte = new ReportePuntos();

        carnet.imprimir(cliente);
        correo.enviarBienvenida(cliente);
        reporte.generar(cliente);
    }
}
