package java_3_aula2_atividade5;

public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente titular;
	
	void depositar (double valor) {
		this.saldo += valor;
	}
	
	boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	boolean transferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			//this.sacar valor;
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	double getSaldo () {
		return this.saldo;
	}
	
	void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	int getAgencia() {
		return this.agencia;
	}
	
	void setAgencia (int valor) {
		this.agencia = valor;
	}
	
	int getConta () {
		return this.conta;
	}
	
	void setConta (int valor) {
		this.conta = valor;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
