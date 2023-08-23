package com.trybe.acc.pessoausuaria;

/** Class. */
public class PessoaUsuaria extends Pessoa {

  public PessoaUsuaria(
      String nome,
      String sobrenome
  ) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  protected String getPessoaUsuaria() {
    if (this.nome == null || this.sobrenome == null) {
      return "Pessoa usuária inválida";
    }

    if (this.nome.isEmpty() || this.sobrenome.isEmpty()) {
      return "Pessoa usuária inválida";
    }

    return super.nome + "." + super.sobrenome;
  }
}

