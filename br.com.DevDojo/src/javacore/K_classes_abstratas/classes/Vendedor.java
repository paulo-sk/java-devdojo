package javacore.K_classes_abstratas.classes;

public class Vendedor extends Funcionario{

	private double totalVendas;
	
	

	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}
	
	public Vendedor() {
		
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public void calculaSalario() {
		this.salario = this.totalVendas * 0.05 + salario;
		
	}
	
}
