import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Bruce Wayne";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("Nome do Cliente: " +nome);
        System.out.println("Tipo conta: " +tipoConta);
        System.out.println("Saldo Atual: " +saldo);
        System.out.println("***************************");

        String menu = """
                    ** Digite sua opção **
                    1 - Colsutar Saldo
                    2 - Transferir Valor
                    3 - Receber Valor
                    4 - Sair
                    
                    """;

        while ( opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
