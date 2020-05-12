package javacore.F_associacao.classes;

public class Estudante {
	
	private Seminario seminario;
	private String nome;
	private int idade;
	
	public Estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Estudante() {
		
	}
	
	public void imprime() {
		
		if(this.nome != null) {
			System.out.println("Nome: "+this.nome);
		}
		else
			System.out.println("Nome: não registrado.");
		
		
		if(this.idade != 0) {
			System.out.println("idade: "+this.idade);
		}
		else
			System.out.println("idade: não registrado.");
		
		
		if(this.seminario != null) {
			System.out.println("Seminarios participante: "+this.seminario.getTitulo());
			return;
		}
		
		System.out.println("Seminario participantes: nem um.");
	}
	
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
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
