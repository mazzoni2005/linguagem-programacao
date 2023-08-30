import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoAluno moduloNota = new CalculoAluno();
        System.out.println("Insira sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        Double resultado = moduloNota.calcularMedia(nota1, nota2);
        System.out.println("Sua média é de " + resultado);
    }
}
