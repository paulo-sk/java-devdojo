package javacore.K_classes_abstratas.classes;


public class Gerente extends Funcionario{

	public Gerente(String nome, String clt, double salario) {
		super(nome,clt,salario);
	}
	
	public Gerente() {}

	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		this.salario = this.salario * 0.2 + this.salario;
	}
	
	

}
