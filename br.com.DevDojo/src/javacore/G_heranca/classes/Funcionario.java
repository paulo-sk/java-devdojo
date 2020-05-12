package javacore.G_heranca.classes;

public class Funcionario extends Pessoa {
	
	

	private double salario;
	
	public Funcionario(String nome,String cpf) {
		super(nome,cpf);
		
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("salario: "+this.salario);
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento() {
		System.out.println("Eu, "+super.nome+" recebi meu salario.");
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
