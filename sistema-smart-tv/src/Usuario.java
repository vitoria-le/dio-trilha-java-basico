public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv esta ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" atual status -> Tv esta ligada? " + smartTv.ligada);

        smartTv.aumentar();
        System.out.println("atual status -> Qual o volume? " + smartTv.volume);

        smartTv.diminuir();
        System.out.println("atual status -> Qual o volume? " + smartTv.volume);

        smartTv.aumentarcanal();
        System.out.println("atual status -> Qual o canal? " + smartTv.canal);

        smartTv.diminuircanal();
        System.out.println("atual status -> Qual o canal? " + smartTv.canal);

        smartTv.mudarcanal(15);
        System.out.println("novo canal " + smartTv.canal);
    }
}
