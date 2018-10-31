package java_3_aula5_atividade_3;

public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}
}
