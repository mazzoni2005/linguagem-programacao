import java.util.concurrent.ThreadLocalRandom;

public class Lista02Ex01 {
    public static void main(String[] args) {
        int numeroEscolhido = ThreadLocalRandom.current().nextInt(0, 11);
        Integer contador = 1;
        System.out.println(numeroEscolhido);
        while(numeroEscolhido != 9){
            contador++;
            System.out.println("Você sorteou o número errado.");
            numeroEscolhido = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(numeroEscolhido);
        } if (contador <= 3){
            System.out.println("Você é MUITO sortudo!");
        } else if (contador >= 4 && contador <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar.");
        }
}}
