package javacore.C_sobrecargaconstrutores.classes;

public class Estudante {
	 private String nome;
	 private String matricula;
	 private double[] notas;
	 private String dataMatricula;
	 
	 public Estudante(String nome, String matricula, double[] notas) {
		 this.nome = nome;
		 this.matricula = matricula;
		 this.notas = notas;
	 }
	 
	 public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
		 //this = cahamada de um construtor dentro de outro construtor.
		 this(nome,matricula,notas);
		 this.dataMatricula = dataMatricula;
	 }
	 
	 public Estudante() {
		 
	 }
	 
	 public void imprime() {
		 System.out.println("nome: "+this.nome);
		 System.out.println("matricula: "+this.matricula);
		 int i = 1;
		 for(double nota: notas) {
			 
			 System.out.println("nota "+i+" = "+nota);
			 i++;
		 }
		 System.out.println("Data da matricula: "+this.dataMatricula);
	 }
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
}