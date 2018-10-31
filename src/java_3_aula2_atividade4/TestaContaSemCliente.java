package java_3_aula2_atividade4;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.saldo);
		
		/* conta.titular ainda não foi instanciado, a propriedade conta.titular é NULL */
		System.out.println(conta.titular);
		//conta.titular.nome = "Alexandre";
		//System.out.println(conta.titular.nome);//gera exceção NullPointerException, pois conta.titular é null
		
		conta.titular = new Cliente();
		System.out.println(conta.titular);
		
		conta.titular.nome = "Alexandre";
		System.out.println(conta.titular.nome);
	}
}
