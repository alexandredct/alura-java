package java_3_aula2_atividade4;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.saldo);
		
		/* conta.titular ainda n�o foi instanciado, a propriedade conta.titular � NULL */
		System.out.println(conta.titular);
		//conta.titular.nome = "Alexandre";
		//System.out.println(conta.titular.nome);//gera exce��o NullPointerException, pois conta.titular � null
		
		conta.titular = new Cliente();
		System.out.println(conta.titular);
		
		conta.titular.nome = "Alexandre";
		System.out.println(conta.titular.nome);
	}
}
