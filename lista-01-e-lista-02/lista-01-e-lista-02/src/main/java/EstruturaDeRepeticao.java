import java.util.concurrent.ThreadLocalRandom;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        System.out.println("for de 0 a 10");
        for(int i = 0; i <= 10; i++){
        System.out.println(i);
    }
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        int numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        while (numeroAleatorio != 5){
            System.out.println("Ainda não acertou");
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
    };

        System.out.println("Número 5 foi sorteado");


        int numeroAleatorio2;
        do {
            System.out.println("Gerando um número aleatório");
            numeroAleatorio2 = ThreadLocalRandom.current().nextInt(0, 11);
        } while (numeroAleatorio2 != 5);

        System.out.println("Número 5 foi sorteado");
    }}
