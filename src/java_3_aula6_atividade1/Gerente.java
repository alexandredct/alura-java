package java_3_aula6_atividade1;

public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Calculando a bonifica��o do GERENTE");
		return super.getSalario();
	}

	

}
