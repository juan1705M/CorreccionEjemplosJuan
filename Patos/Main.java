public class Main {
    public static void main(String[] args) {
        Pato mallard = new PatoMallard();
        Pato mandarin = new PatoMandarin();
        Pato deHule = new PatoDeHule();
        Pato deCasa = new PatoDeCasa();
    

    System.out.println("=== Pato Mallard ===");
        mallard.dibujar();
        mallard.nadar();
        mallard.hacerQuack();
        mallard.emprenderVuelo();

        System.out.println("\n=== Pato Mandarín ===");
        mandarin.dibujar();
        mandarin.nadar();
        mandarin.hacerQuack();
        mandarin.emprenderVuelo();

        System.out.println("\n=== Pato de Hule ===");
        deHule.dibujar();
        deHule.nadar();
        deHule.hacerQuack();
        deHule.emprenderVuelo();

        System.out.println("\n=== Pato de Casa ===");
        deCasa.dibujar();
        deCasa.nadar();
        deCasa.hacerQuack();
        deCasa.emprenderVuelo();
}
}
