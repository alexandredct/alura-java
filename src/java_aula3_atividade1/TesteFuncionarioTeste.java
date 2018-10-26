package java_aula3_atividade1;

public class TesteFuncionarioTeste {
	public static void main(String[] args) {
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setNome("Nico Steppat");
		f1.setSalario(3000.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setSalario(4000.00);
		f2.setTipo(2);
		System.out.println(f2.getBonificacao());
		

		FuncionarioTeste f3 = new FuncionarioTeste();
		f3.setSalario(5000.00);
		f3.setTipo(3);
		System.out.println(f3.getBonificacao());
	}
}
