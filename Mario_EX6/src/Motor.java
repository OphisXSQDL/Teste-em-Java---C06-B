public class Motor {

    String cilindradas;
    float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void mostrarInfo(){
        System.out.println("Cilindradas do motor: "+cilindradas);
        System.out.println("Velocidade máxima que pode atingir: "+velocidadeMaxima);
    }
}
