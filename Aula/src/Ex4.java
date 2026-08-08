import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        int numAlunos;

        System.out.println("Digite o número de alunos:");

        Scanner entrada = new Scanner(System.in);
        numAlunos = entrada.nextInt();

        switch(numAlunos)
        {
            case 10:
                System.out.println("Sala I-16");
                break;

            case 20:
                System.out.println("Sala I-16");
                break;

            case 30:
                System.out.println("Sala I-30");
                break;

            default:
                System.out.println("Nenhuma das opções foi selecionada.");
                break;
        }
    }
}
