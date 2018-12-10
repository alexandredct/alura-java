package java_4_aula5;

public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(123,456);
		try {
			c.deposita(12.2);
		} catch (MinhaExcecao e) {
			System.out.println("Tratamento da exceção.");
		}
	}
}
