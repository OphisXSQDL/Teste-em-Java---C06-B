public class Zumbi {

    double vida;
    String nome;

    double mostrarvida(){
        return vida;
    }

    void transferenciaVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo += quantia;
    }
}
