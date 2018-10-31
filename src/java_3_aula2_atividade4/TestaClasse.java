package java_3_aula2_atividade4;

public class TestaClasse {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Fulano de Tal";
		cliente1.cpf = "222222222";
		cliente1.profissao = "programador";
		
		Conta conta1 = new Conta();
		conta1.depositar(100);
		conta1.titular = cliente1;
		
		System.out.println(conta1.titular.nome);
	}
}
