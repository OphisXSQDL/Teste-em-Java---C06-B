public class Zumbi {

    public double vida;
    public String nome;

    public double mostraVida() {
        return vida;
    }

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia) {

        // Verifica se a quantidade é válida
        if (quantia <= 0) {
            return false;
        }

        // Verifica se o zumbi possui vida suficiente
        if (vida < quantia) {
            return false;
        }

        // Realiza a transferência
        vida -= quantia;
        zumbiAlvo.vida += quantia;

        return true;
    }
}