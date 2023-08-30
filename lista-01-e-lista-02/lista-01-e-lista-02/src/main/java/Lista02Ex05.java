public class Lista02Ex05 {
    public static void main(String[] args) {
        Integer numero01 = 2;
        Integer numero02 = 5;
        Integer valorFinal = 1;
        for (int i = 0; i < 5; i++){
            valorFinal = valorFinal * numero01;
        }
        System.out.println("O valor final é de " + valorFinal);
    }
}