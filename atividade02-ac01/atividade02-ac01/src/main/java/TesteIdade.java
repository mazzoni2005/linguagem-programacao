import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Idade moduloIdade = new Idade();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        Integer idade = leitor.nextInt();
        moduloIdade.classificarIdade(idade);
    }
}
