import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica moduloValidacaoNumerica = new ValidacaoNumerica();

        Boolean funcionando = true;
        while(funcionando){
            System.out.println("Insira um número que você quer saber se é primo ou não:");
            Double numero = leitor.nextDouble();
            if(numero < 0){
                funcionando = false;
                System.out.println("Aí não meu chapa");
            } else {
                moduloValidacaoNumerica.verificarPrimo(numero);
            }
        }
    }
}
