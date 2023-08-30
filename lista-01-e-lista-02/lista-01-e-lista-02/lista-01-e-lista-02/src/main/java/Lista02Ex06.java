import java.util.concurrent.ThreadLocalRandom;

public class Lista02Ex06 {
    public static void main(String[] args) {
        Integer numero = 95;
        Integer aleatorioPar = 0;
        Integer aleatorioImpar = 0;
        Boolean sorteado = false;
        for (int i = 0; i < 200; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
            if (numeroAleatorio == numero && sorteado == false){
                System.out.println("O seu número foi sorteado na posição " + i);
                sorteado = true;
            }
            if (numeroAleatorio % 2 == 0){
                aleatorioPar ++;
            } else {
                aleatorioImpar ++;
            }
        }
        System.out.println("Foram sorteados " + aleatorioPar + " números pares");
        System.out.println("Foram sorteados " + aleatorioImpar + " números ímpares");
    }
}
