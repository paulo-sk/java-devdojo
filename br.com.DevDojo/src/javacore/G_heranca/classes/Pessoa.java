package javacore.G_heranca.classes;


//Nao precisa, mas e so para vc saber, que toda classe é extendida da classe Object(o patriarca).
public class Pessoa extends Object{
	
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Endereco: "+this.endereco.getRua());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
