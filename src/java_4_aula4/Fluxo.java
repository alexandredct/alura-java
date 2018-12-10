package java_4_aula4;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exceção: " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	//Exceção que extende de RuntimeException não são verificados pelo compilador  
	private static void metodo2() {
		System.out.println("Início do método 2");
		
		for (int i=1; i<= 5; i++) {
			System.out.println(i);
		}
		throw new MinhaExcecao("Falha");
		
		//System.out.println("Fim do metodo 2");
	}
}
