package javacore.B_sobrecargametodos.classes;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String rg; //novo atributo depois de terminado o sistema
	private int idade;
	
	
	public void init(String nome, String cpf, double salario) { //metodo somente para inicializar os valores;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	//Esse metodo é um overload(sobrecarga) do primeiro, e ao inves de mudar o primeiro,
	//eu simplesmente adicionei todos do primeiro ao segundo, mais o novo atributo rg.
	
	public void init(String nome, String cpf, double salario,String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}
	
	public void init(String nome, String cpf, double salario,String rg,int idade) {
		init(nome,cpf,salario,rg);
		this.idade = idade;
	}
	
	public void print() {
		
		System.out.println("nome: "+this.nome);
		System.out.println("cpf: "+this.cpf);
		System.out.println("salario: "+this.salario);
		System.out.println("rg: "+this.rg);
		System.out.println("idade: "+this.idade);
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
