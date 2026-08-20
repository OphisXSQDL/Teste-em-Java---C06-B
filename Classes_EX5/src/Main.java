public class Main {

    public static void main(String[] args) {

        Personagem Joker = new Personagem();
        Personagem Ann = new Personagem();
        
        Joker.vida = 100;
        Ann.vida = 70;
        
        Arma arma1 = new Arma();
        Arma arma2 = new Arma();
        
        arma1.descricao = "Kukri";
        arma2.descricao = "Chicote";

        arma1.resistencia = 50;
        arma2.resistencia = 30;

        Joker.arma = arma1;
        Ann.arma = arma2;

        System.out.println("Vida atual de Joker: "+ Joker.vida);
        System.out.println("Vida atual de Ann: "+ Ann.vida);

        System.out.println("Resistência atual da arma de Joker:" + arma1.resistencia);
        System.out.println("Resistência atual da arma de Ann:" + arma2.resistencia);

        Joker.tomarDano();
        System.out.println("Joker bateu em um espinho e tomou dano!");
        System.out.println("Vida de Joker atual após o espinho: " + Joker.vida);

        Joker.usarArma();
        System.out.println("Joker usou sua arma para matar Cerberus.");
        arma1.mostraInfoArma();

        Ann.usarArma();
        System.out.println("Ann chicoteou seu inimigo até a morte!!");
        arma2.mostraInfoArma();

        Ann.tomarDano();
        System.out.println("Um monstro se aproxima na surdina e embosca Ann, com ela perdendo um pouco de vida no processo.");
        System.out.println("Vida de Ann após o embosque do inimigo: " + Ann.vida);
    }
}
