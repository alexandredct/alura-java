package java_aula2_atividade6;

public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente titular;
	private static int total;
	
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
		if ( valor <= 0) {
			System.out.println("Valor menor ou igual a 0 não é permitido!");
			return;
		}
		this.agencia = valor;
	}
	
	int getConta () {
		return this.conta;
	}
	
	void setConta (int valor) {
		if ( valor <= 0) {
			System.out.println("Valor menor ou igual a 0 não é permitido!");
			return;
		}
		this.conta = valor;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public Conta(int agencia, int numero) {
		this.setAgencia(agencia);
		this.setConta(numero);
		Conta.total++;
		System.out.println("Conta em criação:");
		System.out.println("O total de contas é: " + total);
	}
	
	public int getTotal_old() {
		return Conta.total;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
