import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        CalculoNutricao moduloCalculoNutricao = new CalculoNutricao();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o peso da pessoa 1: ");
        Double peso = leitor.nextDouble();
        System.out.println("Insira a altura da pessoa 1: ");
        Double altura = leitor.nextDouble();
        moduloCalculoNutricao.calculaIMC(peso, altura);

        System.out.println("Insira o peso da pessoa 2: ");
        altura = leitor.nextDouble();
        System.out.println("Insira a altura da pessoa 2: ");
        altura = leitor.nextDouble();
        moduloCalculoNutricao.calculaIMC(peso, altura);
    }
}
