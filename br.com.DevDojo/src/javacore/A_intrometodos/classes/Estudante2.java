package javacore.A_intrometodos.classes;

public class Estudante2 {
	
	private String nome;
	private int idade;
	private String matricula;
	private double[] notas = new double[3];
	private double media;
	private boolean aprovado;
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("idade: "+this.idade);
		System.out.println("matricula: "+this.matricula);
		
	}
	
	public void tirarMedia() {
		
		double soma = 0;
		
		for (double nota : this.notas) {
			soma += nota;
		}
		
		this.media = soma / this.notas.length;
		
		if(this.media < 6) {
			this.aprovado = false;
			System.out.println("A media do aluno e: "+this.media+", situação: reprovado.");
			return;
		}
		this.aprovado = true;
		System.out.println("A media do aluno e: "+this.media+", situação: aprovado.");
			
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	

}
