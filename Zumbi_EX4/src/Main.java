public class Main {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Roberto";
        zumbi1.vida = 100;

        zumbi2.nome = "Ronaldo";
        zumbi2.vida = 50;

        System.out.println(zumbi1.nome + " tem " + zumbi1.mostraVida() + " de vida.");
        System.out.println(zumbi2.nome + " tem " + zumbi2.mostraVida() + " de vida.");

        boolean transferencia = zumbi1.transfereVida(zumbi2, 30);

        if (transferencia) {
            System.out.println("\nTransferência realizada com sucesso!");
        } else {
            System.out.println("\nNão foi possível realizar a transferência.");
        }

        System.out.println(zumbi1.nome + " tem " + zumbi1.mostraVida() + " de vida.");
        System.out.println(zumbi2.nome + " tem " + zumbi2.mostraVida() + " de vida.");
    }
}