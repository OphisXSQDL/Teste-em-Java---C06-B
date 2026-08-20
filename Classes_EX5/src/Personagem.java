public class Personagem {

    String nome;
    int pontos;
    Arma arma;
    int vida;

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        vida -= 5;
    }
}
