public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(String nome, String cilindradas, float velocidadeMaxima) {
        this.nome = nome;
        // Composição: o Motor é criado junto com o Kart
        this.motor = new Motor(cilindradas, velocidadeMaxima);
    }

    void pular(){
        System.out.println("O kart de "+ nome + " pulou!");
    }

    void soltarTurbo(){
        System.out.println(nome +" soltou o turbo firmin!");
    }

    void fazerDrift(){
        System.out.println(nome + " deitou no drift!");
    }
}
