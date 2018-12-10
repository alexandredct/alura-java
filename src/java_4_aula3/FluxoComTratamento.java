package java_4_aula3;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException e) {
			System.out.println("Exce��o aritm�tica");
			e.printStackTrace();
		} catch (NullPointerException | ArrayStoreException e) {
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
			//int a = i / 0;
			String a = null;
		}
		
		System.out.println("Fim do metodo 2");
	}
}
