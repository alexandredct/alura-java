package java_4_aula5;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
