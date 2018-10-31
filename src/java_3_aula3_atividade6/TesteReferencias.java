package java_3_aula3_atividade6;

public class TesteReferencias {
	public static void main(String[] args) {
		/* ====================================================== */
		Funcionario g1 = new Funcionario();
		g1.setNome("Marcos");
		g1.setSalario(2000);		
		/* ====================================================== */
		Gerente g2 = new Gerente();
		g2.setNome("Amanda");
		g2.setSalario(5000.00);
		/* ====================================================== */
		EditorVideo g3 = new EditorVideo();
		g3.setNome("João");
		g3.setSalario(2500);
		/* ====================================================== */
		Designer g4 = new Designer();
		g4.setNome("Maurício");
		g4.setSalario(2000);
		/* ====================================================== */
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(g2);
		controle.registra(g3);
		controle.registra(g4);
		System.out.println(controle.getSoma());
	}
}
