package javacore.I_modificador_final.classes;

public class Comprador {
	
	public String nome;

	@Override
	public String toString() {
		return "Comprador [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
