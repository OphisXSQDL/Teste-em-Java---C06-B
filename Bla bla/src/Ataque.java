public class Ataque {

    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();

        System.out.println("Nome: " + zumbi.nome);
        System.out.println("Idade: " + zumbi.idade);

        zumbi.correr();
        zumbi.pular();

    }
}
