package javacore.L_interfaces.classes;

public class Produto implements Tributavel,Transportavel{
	
	private String nome;
	private double peso;
	private double preco;
	private double valorFrete;
	private double precoFinal;
	

	@Override
	public void calculaFrete() {
		// TODO Auto-generated method stub
		this.valorFrete = preco * 0.1 + peso * 0.1;
	}

	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		this.preco = preco + (preco * IMPOSTO);
		
	}
	
	public void calculaValorFinal() {
		this.precoFinal = preco + valorFrete;
	}
	

	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", valorFrete=" + valorFrete + ", precoFinal="
				+ precoFinal + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	
	
}
