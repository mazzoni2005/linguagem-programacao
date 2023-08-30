package org.example;

public class OperadorTernario {

  public static void main(String[] args) {

    Boolean bloqueado = false;

    if (bloqueado) {
      System.out.println("Está bloqueado");
    } else {
      System.out.println("Não está bloqueado");
    }

    String mensagem = bloqueado ? "Está bloqueado"
        : "Não está bloqueado";

    System.out.println(mensagem);
  }
}