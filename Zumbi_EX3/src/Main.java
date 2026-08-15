public class Main {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "José";
        zumbi2.nome = "André";

        zumbi1.vida = 20;
        zumbi2.vida = 30;

        if(zumbi1.vida < zumbi2.vida)
        {
            System.out.println("O zumbi " + zumbi1.nome + " tem a vida menor do que o " + zumbi2.nome);
        }
    }
}
