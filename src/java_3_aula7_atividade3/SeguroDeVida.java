package java_3_aula7_atividade3;

public class SeguroDeVida implements Tributavel{
	private double valor;
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double getValorImposto() {
		return this.valor * 0.11;
	}

}
