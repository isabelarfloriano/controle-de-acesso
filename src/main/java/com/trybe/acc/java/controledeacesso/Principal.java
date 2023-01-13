package com.trybe.acc.java.controledeacesso;

import java.util.Locale;
import java.util.Scanner;

/**
 * class Principal.
 *
 */
public class Principal {

  /**
   * Método principal onde o menu é gerado e ocorre o redirecionamento de fluxo mensagens.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    short escolha;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
      escolha = scan.nextShort();
      if (escolha == 1) {
        System.out.println("Entre com a sua idade:");
        short idade = scan.nextShort();
        Cliente.classificaPorIdade(idade);
      } else if (escolha == 2) {
        Cliente.gerarRelatorio();
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    } while (escolha != 2);
    scan.close();
  }
}
