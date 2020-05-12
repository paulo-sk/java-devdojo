package javacore.H_sobrescrita_metodo.classes;

public class Pessoa extends Object{
	
	private String nome;
	private int idade;
	
	//com esse override, ao inves de imprimir o endereço de memoria, vai imprimir info dos atributos
	//e os atributos nao precisam ser do tipo string, vide idade
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
