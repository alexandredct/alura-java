package java_aula3_atividade1;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gerente 1");
		g1.setCpf("1234314");
		g1.setSalario(4000.50);
		g1.setSenha(123432422);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSenha());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());
		
		boolean autenticado = g1.autentica(g1.getSenha());
		System.out.println(autenticado);
	}
}
