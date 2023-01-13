package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * classe Cliente.
 *
 */
public class Cliente {
  static ArrayList<Short> menores = new ArrayList<Short>();
  static ArrayList<Short> adultos = new ArrayList<Short>();
  static ArrayList<Short> cinquentaMais = new ArrayList<Short>();

  /**
   * metodo que classifica o cliente conforme a idade e registra seu acesso.
   */
  public static void classificaPorIdade(short idade) {
    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      menores.add(idade);
    } else if (18 <= idade && idade >= 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
      adultos.add(idade);
    } else if (idade <= 50) {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      cinquentaMais.add(idade);
    }
  }

  /**
   * metodo que calcula e imprime o relatorio de acessos baseados na classificação de idade.
   */
  public static void gerarRelatorio() {
    DecimalFormat df = new DecimalFormat();
    df.applyPattern("#.#");

    int totalMenores = menores.size();
    int totalAdultos = adultos.size();
    int totalCinquentaMais = cinquentaMais.size();

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + totalMenores);
    System.out.println("adultas: " + totalAdultos);
    System.out.println("a partir de 50: " + totalCinquentaMais);
    
    int totalClientes = totalMenores + totalAdultos + totalCinquentaMais;
    
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + df.format((totalMenores / (float) totalClientes) * 100) + "%");
    System.out.println("adultas: " + df.format((totalAdultos / (float) totalClientes) * 100) + "%");
    System.out.println(
        "a partir de 50: " + df.format((totalCinquentaMais / (float) totalClientes) * 100) + "%");
    
    System.out.println("TOTAL: " + totalClientes);

  }
}
