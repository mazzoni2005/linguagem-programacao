package org.example;

import java.util.Scanner;

public class SwitchCase {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 3");
    Integer numeroDigitado = leitor.nextInt();

    if (numeroDigitado == 1) {
      System.out.println("Você escolheu a opção 1");
    } else if (numeroDigitado == 2) {
      System.out.println("Você escolheu a opção 2");
    } else if (numeroDigitado == 3) {
      System.out.println("Você escolheu a opção 3");
    } else {
      System.out.println("Opção inválida");
    }

    switch (numeroDigitado) {
      case 1 -> System.out.println("Você escolheu a opção 1");
      case 2 -> System.out.println("Você escolheu a opção 2");
      case 3 -> System.out.println("Você escolheu a opção 3");
      default -> System.out.println("Opção Invalida");
    }
  }
}
