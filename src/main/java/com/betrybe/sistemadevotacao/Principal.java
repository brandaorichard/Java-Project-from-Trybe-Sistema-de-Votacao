package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal Class.
 */
public class Principal {

  /**
   * Main method.
   *
   * @param args Principal object args
   *
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    System.out.println("Cadastro de pessoas candidatas:");
    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      int opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 1) {
        System.out.print("Entre com o nome da pessoa candidata: ");
        String nome = scanner.nextLine();
        System.out.print("Entre com o número da pessoa candidata: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else if (opcao == 2) {
        break;
      } else {
        System.out.println("Opção inválida! Por favor, entre com 1 ou 2.");
      }
    }

    System.out.println("\nCadastro de pessoas eleitoras:");
    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      int opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 1) {
        System.out.print("Entre com o nome da pessoa eleitora: ");
        String nome = scanner.nextLine();
        System.out.print("Entre com o cpf da pessoa eleitora: ");
        String cpf = scanner.nextLine();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      } else if (opcao == 2) {
        break;
      } else {
        System.out.println("Opção inválida! Por favor, entre com 1 ou 2.");
      }
    }

    System.out.println("\nVotação:");
    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      int opcao = scanner.nextInt();

      if (opcao == 1) {
        scanner.nextLine();
        System.out.print("Entre com o cpf da pessoa eleitora: ");
        String cpf = scanner.nextLine();
        System.out.print("Entre com o número da pessoa candidata: ");
        int numero = scanner.nextInt();

        gerenciamentoVotacao.votar(cpf, numero);
      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opcao == 3) {
        System.out.println("Votação finalizada.");
        gerenciamentoVotacao.mostrarResultado();
        break;
      } else {
        System.out.println("Opção inválida! Por favor, entre com 1, 2 ou 3.");
      }
    }
    scanner.close();
  }
}
