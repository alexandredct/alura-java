package java_3_aula6_atividade5;

//Gerente é um Funcionário; Herda da class Funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	private int senha;

	public double getBonificacao() {
		System.out.println("Calculando a bonificação do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	

}
