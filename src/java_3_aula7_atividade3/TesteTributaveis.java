package java_3_aula7_atividade3;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(111, 231);
		//Conta c1 = new ContaCorrente(111, 231); //Não funciona!
		c1.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida() ;
		seguro.setValor(110);
		
		AcaoBolsa acao = new AcaoBolsa();
		acao.setValor(1000);
		
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.recolherImposto(c1);
		calc.recolherImposto(seguro);
		calc.recolherImposto(acao);
		
		System.out.println(calc.getImpostoReconhido());

	}
}
