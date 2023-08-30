import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma data: ");

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataDigitada = LocalDate.parse(leitor.nextLine(), formatadorData);

        Integer diaDaSemana = dataDigitada.getDayOfWeek().getValue();

        String dia = "";

        switch (diaDaSemana){
            case 1 -> dia = "Segunda";
            case 2 -> dia = "Terça";
            case 3 -> dia = "Quarta";
            case 4 -> dia = "Quinta";
            case 5 -> dia = "Sexta";
            case 6 -> dia = "Sábado";
            case 7 -> dia = "Domingo";
        }

        if (dataDigitada.isEqual(LocalDate.now())){
            System.out.println("O dia " + formatadorData.format(dataDigitada) + " é hoje e é " + dia);
        } else if(dataDigitada.isAfter(LocalDate.now())){
            System.out.println("O dia " + formatadorData.format(dataDigitada) + " será " + dia);
        } else {
            System.out.println("O dia " + formatadorData.format(dataDigitada) + " foi " + dia);
        }
    }
}
