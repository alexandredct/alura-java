package java_3_aula6_atividade1;

public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	//Classe abstratas n�o s�o obrigadas a implementar m�todos abstratos da classe m�e
}
