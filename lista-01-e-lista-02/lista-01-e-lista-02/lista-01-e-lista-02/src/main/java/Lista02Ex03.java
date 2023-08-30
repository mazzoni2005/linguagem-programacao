import java.util.concurrent.ThreadLocalRandom;

public class Lista02Ex03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i++){
            if (i % 2 != 0){
                System.out.println(i);
                i++;
            }
        }
    }
}
