public class Zumbi {

    String nome;
    int vida;

    double mostrarvida(){
        return vida;
    }

    void transferenciaVida(Zumbi zumbiAlvo, double quantia){

        if(vida < quantia)
        {
            System.out.println("Vida insuficiente");
        }
        else
        {
            System.out.println("Vida transferida.");
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }
    }
}
