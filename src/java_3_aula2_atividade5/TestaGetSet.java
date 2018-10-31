package java_3_aula2_atividade5;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(22);
		conta.setConta(123);
		conta.setSaldo(120.7);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getConta());
		System.out.println(conta.getSaldo());
		
		Cliente cli = new Cliente();
		cli.setCpf("12342134");
		cli.setNome("Fulado de Tal");
		cli.setProfissao("Programador");
		
		conta.setTitular(cli);
		System.out.println(conta.getTitular().getNome());
	}
}
