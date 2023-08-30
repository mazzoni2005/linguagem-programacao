import java.util.concurrent.ThreadLocalRandom;

public class Lista02Ex8 {
    public static void main(String[] args) {
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroqueijos = 0;
        for (int i = 0; i < 10; i++){
            Integer votos = ThreadLocalRandom.current().nextInt(1, 4);
            if (votos == 1){
                mussarela ++;
            } else if (votos == 2){
                calabresa ++;
            } else{
                quatroqueijos ++;
            }

        }
        System.out.println("A pizza de mussarela teve " + mussarela + " votos;");
        System.out.println("A pizza de calabresa teve " + calabresa + " votos;");
        System.out.println("A pizza de quatro-queijos teve " + quatroqueijos + " votos;");
        if (mussarela > calabresa && mussarela > quatroqueijos){
            System.out.println("O sabor favorito da rapaziada é mussarela");
        } else if( calabresa > mussarela && calabresa > quatroqueijos){
            System.out.println("O sabor favorito da rapaziada é calabresa");
        } else {
            System.out.println("O sabor favorito da rapaziada é quatro queijos");
        }

    }
}
