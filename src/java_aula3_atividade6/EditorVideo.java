package java_aula3_atividade6;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Calculando a bonificação do EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
}
