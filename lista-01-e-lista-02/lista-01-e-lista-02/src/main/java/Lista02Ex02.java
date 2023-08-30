import java.util.concurrent.ThreadLocalRandom;

public class Lista02Ex02 {
    public static void main(String[] args) {
        Integer numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer somaAleatorios = 0;
        Integer contador = 0;
        while (numAleatorio != 0){
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            contador += numAleatorio;
        }
        System.out.println("A soma dos números é " + contador);
    }
}
