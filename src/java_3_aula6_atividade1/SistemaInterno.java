package java_3_aula6_atividade1;

public class SistemaInterno {
	private int senha = 222;
	
	public void autentica(FuncionarioAutenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
