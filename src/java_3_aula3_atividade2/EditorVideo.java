package java_3_aula3_atividade2;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Calculando a bonificação do EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
}
