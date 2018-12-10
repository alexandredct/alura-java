package java_4_aula4;

public class Fluxo2 {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao2 e) {
			String msg = e.getMessage();
			System.out.println("Exce��o: " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao2 {
		System.out.println("In�cio do m�todo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	// Exce��o que extenda de Exception requer throws MinhaException2 precisa ser
	// anunciado na assinatura para ser compilado. Exce��o CHECKED!
	private static void metodo2() throws MinhaExcecao2 {
		System.out.println("In�cio do m�todo 2");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		throw new MinhaExcecao2("Falha");

		// System.out.println("Fim do metodo 2");
	}
}
