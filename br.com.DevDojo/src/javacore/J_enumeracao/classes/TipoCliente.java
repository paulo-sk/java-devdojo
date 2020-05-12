package javacore.J_enumeracao.classes;

public enum TipoCliente {
	//private int tipo  (nao se define nada antes das proprias enumeraçoes, que sao as constantes abaixo)
	//vc pode associar essas constantes à numeros e strings, para serem melhores reprensentadas no banco de dados ou para o usuário.
	PESSOA_FÍSICA(1,"pessoa física"), PESSOA_JURÍDICA(2,"pessoa jurídica");
	
	private final int tipo;
	private final String nome;

	private TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
		
	}
	public int getTipo() {
		return tipo;
	}

	
	
	
}
