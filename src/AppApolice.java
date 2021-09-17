import java.util.Scanner;

public class AppApolice {
    public static void main(String[] args) {

        //Objetos
        Apolice cliente1 = new Apolice("Enzo",26,1000);
        Apolice cliente2 = new Apolice();

        //Scanner
        Scanner input = new Scanner(System.in);

        // Recebendo dados e executando metodos
        //Imprimindo cliente 1 com dados do construtor
        System.out.println("Dados Apolice: " + cliente1.imprimirDadosApolice());
        System.out.println("Valor da Apolice de acordo com Idade: "+cliente1.calculaValorApoliceIdade());
        cliente1.calculaDescontoCidade("Curitiba");
        System.out.println("Valor Apolice Final (de acordo com cidade informada): "+ cliente1.getValorPremio());

        //Recebendo dados conforme construtor 2
        System.out.println("Digite o nome do segurado: ");
        cliente2.setNomeSegurado(input.nextLine());
        System.out.println("Digite a idade do segurado: ");
        cliente2.setIdade(input.nextInt());
        System.out.println("Digite o valor do premio do segurado: ");
        cliente2.setValorPremio(input.nextDouble());
        input.nextLine();


        //Impressao dados construtor 2
        System.out.println("Dados Apolice: " + cliente2.imprimirDadosApolice());
        System.out.println("Valor do Premio de acordo com Idade: "+cliente2.calculaValorApoliceIdade());
        System.out.println("Digite a cidade do segurado");
        cliente2.calculaDescontoCidade(input.nextLine());
        System.out.println("Valor Apolice Final (de acordo com cidade informada): "+cliente2.getValorPremio());
    }
}
