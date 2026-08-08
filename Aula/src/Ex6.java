import java.util.Random;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        int chutar;

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.println(x);

        System.out.println("Digite um número para bater com o aleatório: ");
        Scanner numero = new Scanner(System.in);
        chutar = numero.nextInt();

        while(chutar != x)
        {
            if(chutar > x)
            {
                System.out.println("Número menor que esse.");
            }
            else
                System.out.println("Número maior que esse.");

            System.out.println("Errou! Chute outro:");
            chutar = numero.nextInt();
        }

        System.out.println("Acertou na cagada!");
    }
}
