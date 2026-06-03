public class ServicioCorreo {

    public void enviarBienvenida(Cliente cliente) {
        System.out.println("Enviando correo a: " + cliente.obtenerCorreo());
    }
}
