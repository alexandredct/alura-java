package java_aula3_atividade1;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("1232456");
		nico.setSalario(2500.50);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
		

	}

}
