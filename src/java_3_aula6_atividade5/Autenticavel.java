package java_3_aula6_atividade5;

// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar: setSenha e autentica

public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

	//Classe abstratas não são obrigadas a implementar métodos abstratos da classe mãe
}
