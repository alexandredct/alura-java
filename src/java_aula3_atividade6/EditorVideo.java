package java_aula3_atividade6;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Calculando a bonifica��o do EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
}
