package com.trybe.acc.contapoupanca;

/** Class. */
public class ContaPoupanca {
  private double saldo;
  private final String titularConta;

  /**
   * Construtor da classe ContaPoupanca.
   */
  public ContaPoupanca(String titularConta, double depositoInicial) {
    if (depositoInicial <= 0) {
      throw new IllegalArgumentException(
          "O depósito inicial deve ser maior que zero para abrir uma conta poupança.");
    }

    this.saldo = depositoInicial;
    this.titularConta = titularConta;
  }

  /** Depositar Method.*/
  public void depositar(double value) {
    if (value <= 0) {
      throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
    }
    this.saldo += value;
  }

  /** Sacar Method. */
  public void sacar(double value) {
    if (value <= 0) {
      throw new IllegalArgumentException("Valor de saque deve ser positivo.");
    }

    if ((this.saldo - value) >= 0) {
      this.saldo -= value;
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
