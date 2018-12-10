package java_4_aula2;

public class Fluxo {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exceção identificada");
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	private static void metodo2() {
		System.out.println("Início do método 2");
		
		for (int i=1; i<= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Fim do metodo 2");
	}
}
