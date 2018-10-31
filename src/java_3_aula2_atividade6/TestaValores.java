package java_3_aula2_atividade6;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 321);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getConta());
		
		Conta conta2 = new Conta(1233, 4321);
		
		Conta conta3 = new Conta(12334, 54321);
		
		System.out.println("TOTAL = " + conta2.getTotal_old());
		System.out.println("TOTAL = " + Conta.getTotal());
	}
}
