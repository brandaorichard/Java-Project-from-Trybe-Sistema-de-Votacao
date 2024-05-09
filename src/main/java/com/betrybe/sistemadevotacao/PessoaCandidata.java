package com.betrybe.sistemadevotacao;

/**
 * Candidate Person Class which is an inheritance of Person.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome Person object name
   * @param numero Person object numero
   */
  public PessoaCandidata(String nome, int numero) {
    super();
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    votos++;
  }
}
