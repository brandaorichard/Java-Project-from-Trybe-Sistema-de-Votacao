package com.betrybe.sistemadevotacao;

/**
 * Super Class Pessoa.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}