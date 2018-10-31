package java_3_aula6_atividade5;

public class TesteSistema {
	public static void main(String[] args) {
		
		/* ========================================== */
		Autenticavel g = new Gerente();
		//ou
		//Funcionario g = new Gerente();
		//Gerente g = new Gerente();
		g.setSenha(2222);

		/* ========================================== */
		Autenticavel adm = new Administrador();
		//ou:
		//Funcionario adm = new Administrador();
		//Administrador adm = new Administrador();
		adm.setSenha(222);

		/* ========================================== */
		Funcionario d = new Designer();
		//ou
		//Designer d = new Designer();
		//d.setSenha(222);//Falha, pois apenas a classe Funcionario não possui o atributo senha
		
		/* ========================================== */
		Autenticavel c = new Cliente();
		//ou Cliente c = new Cliente();
		c.setSenha(122);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
		//si.autentica(d);//Designer não assina contrato Autenticavel
	}
}
