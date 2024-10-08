import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean sair = false;

        System.out.println("*********************************************************************************");
        System.out.println("Digite abaixo o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite abaixo o tipo da sua conta: ");
        String tipoConta = scan.nextLine();
        System.out.println("Digite abaixo o seu saldo bancário: ");
        double saldo = scan.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);

        System.out.println("*********************************************************************************");
        String mensagemBank = """
                BEM VINDO AO C6 BANK!
                """;
        System.out.println(mensagemBank);

        do {
            String mensagemInicial = """
                                 MENU DE OPERAÇÕES
                                 1 - Consultar Saldo
                                 2 - Transferir Saldo
                                 3 - Depositar Saldo
                                 4 - Sair""";
            System.out.println(mensagemInicial);
            System.out.println("Escolha uma opção:");
            int op = scan.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("O saldo atual é: " + saldo);
                    System.out.println("\n");
                    break;
                }
                case 2: {
                    System.out.println("Informe abaixo o valor que deseja transferir:");
                    double valorTransferir = scan.nextDouble();
                    saldo = saldo - valorTransferir;
                    System.out.printf("O seu novo saldo é de %f!", saldo);
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    System.out.println("Informe o valor que deseja depositar:");
                    double valorDeposito = scan.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.printf("O seu novo saldo é de %f reais!", saldo);
                    System.out.println("\n");
                    break;
                }
                case 4: {
                    System.out.println("Saindo do sistema...");
                    sair = true;
                    break;
                }
                default: {
                    System.out.println("Opção Inválida!\n");
                    break;
                }
            }
        } while(!sair);
   }
}