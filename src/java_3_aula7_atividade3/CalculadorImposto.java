package java_3_aula7_atividade3;

public class CalculadorImposto {
	
	private static double impostoReconhido;
	
	public static void recolherImposto(Tributavel a) {
		impostoReconhido += a.getValorImposto();
	}
	
	public static double getImpostoReconhido() {
		return impostoReconhido;
	}
}
