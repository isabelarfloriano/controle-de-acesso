package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;

/**
 * classe Cliente.
 *
 */
public class Cliente {
  static ArrayList<Short> menores;
  static ArrayList<Short> adultos;
  static ArrayList<Short> cinquentaMais;

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

}
