public class ValidacaoNumerica {
    void verificarPrimo (Double numero){
        Integer divisores = 0;
        for (int i = 0; i <= numero; i++) {
            if(numero % 1 == 0){
                divisores++;
            }
        } if(divisores == 2){
            System.out.println("O número é primo.");
        } else{
            System.out.println("O número não é primo.");
        }
    }
}
