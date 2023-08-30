import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);

        Double numeroRealAleatorio = ThreadLocalRandom.current().nextDouble(0, 10.1);

        System.out.println("Número: " + numeroAleatorio);
        System.out.println("Número Real: " + numeroRealAleatorio);
    }
}
