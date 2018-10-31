package java_3_aula3_atividade2;

public class ControleBonificacao1 {
	private double soma;
	
	public void registra (Gerente g) {
		double boni = g.getBonificacao();
		this.soma += boni;
	}
	
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public void registra (EditorVideo e) {
		double boni = e.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
