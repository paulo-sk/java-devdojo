package javacore.A_intrometodos.classes;

public class Account {
	
	public String name;
	public int idade;

	public Account(String name, int idade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.idade = idade;
	}
	
	public void setNameIdade(String nome,int idade) {
		this.name = nome;
		this.idade = idade;
	}
	
	public void getName() {
		
		System.out.println("nome: "+this.name+", idade: "+this.idade);
	}

}