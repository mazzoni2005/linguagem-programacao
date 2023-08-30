import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {
        Scanner renda = new Scanner(System.in);
        System.out.println("Digite sua renda: ");
        Double salario = renda.nextDouble();

        ClasseSocial modulo = new ClasseSocial();

        Double salariosMinimoMazzoni = modulo.salarioMin(salario);
        String salarioDecimal = String.format("Você recebe aproximadamente: %.2f", salariosMinimoMazzoni);
        System.out.println(salarioDecimal);

        String classeSocial = modulo.classeSocial(salariosMinimoMazzoni);
        System.out.println("Você pertence à classe social: " + classeSocial);
    }

}