package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Datas {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    LocalDate data = LocalDate.now(); // Iniciando LocalDate com a data atual
    LocalDateTime dataHora = LocalDateTime.now(); // Iniciando LocalDateTime com a data atual

    System.out.println(data);
    System.out.println(dataHora);

    DateTimeFormatter formatadorData =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

    DateTimeFormatter formatadorDataHora =
        DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    // Exibindo data e datahora formatados
    System.out.println(formatadorData.format(data));
    System.out.println(formatadorDataHora.format(dataHora));

    System.out.println("Digite uma data: ");

    // Guardando a data digitada em um objeto de data
    LocalDate dataDigitada = LocalDate
        .parse(leitor.nextLine(), formatadorData);

    System.out.println(dataDigitada);
//    dataDigitada = dataDigitada.minusDays(1); // removendo um dia da data digitada
    System.out.println(dataDigitada);

    // Comparando duas datas
    if (data.isAfter(dataDigitada)) {
      System.out.println("Data de hoje está depois da data digitada");
    } else if (data.isBefore(dataDigitada)) {
      System.out.println("Data de hoje está antes da data digitada");
    } else {
      System.out.println("Data de hoje é igual a data digitada");
    }

    // Retornando o dia da semana
    Integer diaDaSemana = dataDigitada.getDayOfWeek().getValue();
    System.out.println("Dia da semana: " + diaDaSemana);
  }
}
