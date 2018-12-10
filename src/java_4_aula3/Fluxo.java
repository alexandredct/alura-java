package java_4_aula3;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
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
	
	private static void metodo2() {
		System.out.println("In�cio do m�todo 2");
		
		for (int i=1; i<= 5; i++) {
			System.out.println(i);
		}
		throw new ArithmeticException("Falha");
		
		//System.out.println("Fim do metodo 2");
	}
}
