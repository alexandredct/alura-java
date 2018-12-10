package java_4_aula4;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exce��o: " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	private static void metodo1() {
		System.out.println("In�cio do m�todo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	//Exce��o que extende de RuntimeException n�o s�o verificados pelo compilador  
	private static void metodo2() {
		System.out.println("In�cio do m�todo 2");
		
		for (int i=1; i<= 5; i++) {
			System.out.println(i);
		}
		throw new MinhaExcecao("Falha");
		
		//System.out.println("Fim do metodo 2");
	}
}
