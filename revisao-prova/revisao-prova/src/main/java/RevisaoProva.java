import java.util.Scanner;

public class RevisaoProva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double valor = 0.0;
        Double totalConta = 0.0;


        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("|           SPTech Investimentos        |");
            System.out.println("-----------------------------------------");
            System.out.println("|         Olá, o que deseja fazer?      |");
            System.out.println("-----------------------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Simular rendimentos");
            System.out.println("0 - Sair");

            int operacao = leitor.nextInt();

            if (operacao == 0) {
                System.out.println("Saindo do programa...");
                break;
            } else if (operacao == 1) {
                System.out.println("Digite o valor do depósito: ");
                valor = leitor.nextDouble();
                if (valor < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    totalConta = totalConta + valor;
                    System.out.println("Depósito realizado - Saldo atual: R$" + totalConta);
                }
            } else if (operacao == 2) {
                System.out.println("Digite o valor do saque: ");
                valor = leitor.nextDouble();
                if (valor < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    totalConta = totalConta - valor;
                    System.out.println("Saque realizado - Saldo atual: R$" + totalConta);
                }
            } else if (operacao == 3) {
                if (totalConta == 0) {
                    System.out.println("Saldo zerado, opção inválida!");
                } else {
                    Double simulacao = totalConta;
                    System.out.println("|  Saldo atual: R$" + valor + "  |");
                    for (int i = 1; i < 12; i++) {
                        simulacao += (simulacao * 10) / 100;
                        System.out.println(String.format("""
                                ------------------------------
                                | Mês %d | Saldo: R$ %.2f |
                                ------------------------------
                                                            
                                """, i, simulacao));
                    }
                }
            }

        }

    }
}
