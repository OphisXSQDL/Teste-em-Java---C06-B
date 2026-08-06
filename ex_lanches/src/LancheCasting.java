public class LancheCasting
{

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o número de lanche: ");

        int lanche1 = entrada.nextInt();

        System.out.print("Entre com o número de lanche 2: ");
        int lanche2 = entrada.nextInt();

        System.out.print("Entre com o número de lanche 3: ");
        int lanche3 = entrada.nextInt();

        int soma = lanche1+lanche2+lanche3;
        double media = (double) soma/3;

        System.out.println("O preço total dos lanches: "+ soma);
        System.out.println("A média do preço do lanches é: "+ media);
    }
}
