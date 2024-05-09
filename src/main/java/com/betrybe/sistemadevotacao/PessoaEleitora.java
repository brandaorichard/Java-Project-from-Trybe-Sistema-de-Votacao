package com.betrybe.sistemadevotacao;

/**
 * Voter Person Class which is inherited from Pessoa.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Constructor of the PessoaEleitora class.
   *
   * @param nome Person object name
   * @param cpf Person object CPF
   */
  public PessoaEleitora(String nome, String cpf) {
    super();
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
