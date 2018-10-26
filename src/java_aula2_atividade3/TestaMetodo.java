package java_aula2_atividade3;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = "Paulo Siqueira";
		conta.agencia = 22;
		conta.conta = 33;
		conta.saldo = 100;
		
		conta.depositar(70);
		System.out.println(conta.saldo);
		
		conta.sacar(30);
		System.out.println(conta.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.titular = "Marcela Ramos";
		conta2.saldo = 0;
		conta.transferir(100, conta2);
		System.out.println(conta.titular + " possui saldo de " + conta.saldo);
		System.out.println(conta2.titular + " possui saldo de " +  conta2.saldo);
	}
}
