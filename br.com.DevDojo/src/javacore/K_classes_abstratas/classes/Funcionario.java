package javacore.K_classes_abstratas.classes;

//classes abstratas existem somente para serem extendidas, não podem ser instanciadas.
public abstract class Funcionario {
	
	protected String nome;
	protected String clt;
	protected double salario;
	
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	public Funcionario() {}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}
	
	//metodos abstratos devem ser obrigatoriamente sobrescritos nas classes filhas.
	//por isso nao possuem corpo.
	public abstract void calculaSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
