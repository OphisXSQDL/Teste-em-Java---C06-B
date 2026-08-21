public class Main {

    public static void main(String[] args) {

        Piloto p1 = new Piloto("Marcos", false);
        Piloto p2 = new Piloto("Resenhudo", true);

        Kart k1 = new Kart("Zeus", "100", 150.0f);
        Kart k2 = new Kart("Lucifer", "150", 125.0f);

        k1.piloto = p1;
        k2.piloto = p2;

        System.out.println("Piloto: " + k1.piloto.nome + " (Vilão: " + k1.piloto.vilao + ")");
        k1.motor.mostrarInfo();
        k1.piloto.soltarSuperPoder();
        k1.pular();
        k1.soltarTurbo();
        k1.fazerDrift();

        System.out.println("\n--- KART 2 ---");
        System.out.println("Piloto: " + k2.piloto.nome + " (Vilão: " + k2.piloto.vilao + ")");
        k2.motor.mostrarInfo();
        k2.piloto.soltarSuperPoder();
        k2.pular();
        k2.soltarTurbo();
        k2.fazerDrift();
    }
}
