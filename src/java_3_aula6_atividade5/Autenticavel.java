package java_3_aula6_atividade5;

// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar: setSenha e autentica

public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

	//Classe abstratas n�o s�o obrigadas a implementar m�todos abstratos da classe m�e
}
