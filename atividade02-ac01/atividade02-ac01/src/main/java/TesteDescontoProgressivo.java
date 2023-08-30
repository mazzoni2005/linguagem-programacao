import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        DescontoProgressivo moduloDescontoProgressivo = new DescontoProgressivo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor unitário do produto: ");
        Double preco = leitor.nextDouble();
        System.out.println("Insira a quantidade:");
        Integer quantidade = leitor.nextInt();
        Double descontoTotal = moduloDescontoProgressivo.calculoDesconto(preco, quantidade);
        moduloDescontoProgressivo.exibirNotaFiscal(preco, quantidade, descontoTotal);
    }
}
