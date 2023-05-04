package br.ufpb.dcx.sisbanco;

public class Conta {
	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;

	public Conta() {
		this.cpfTitular = "";
		this.numeroAgencia = "";
		this.numeroConta = "";
		this.saldo = 0.0;
	}

	public Conta(String cpf, String numC, String numAg, double saldo) {
		this.cpfTitular = cpf;
		this.numeroConta = numC;
		this.numeroAgencia = numAg;
		this.saldo = saldo;
	}

	public String toString() {
		return "Conta de número:" + this.numeroConta + " da agência:" + this.numeroAgencia + ", do titular com CPF:"
				+ this.cpfTitular + " com saldo de R$:" + this.saldo;
	}

	public String getCpfTitular() {
		return this.cpfTitular;
	}

	public void setCpfTitular(String cpf) {
		this.cpfTitular = cpf;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(String novoNumero) {
		this.numeroConta = novoNumero;
	}

	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public double creditar(double valor) {
		this.saldo += valor;
		return this.saldo;
	}

	public double debitar(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
