package javacore.I_modificador_final.classes;

public class Carro {
	
	private String nome;
	private String marca;
	public static final double VELOCIDADE_FINAL = 300;
	//variaveis do tipo reference, quando usado o final, deve ter o espaço na memoria criado/inicializado
	public final Comprador comprador = new Comprador();
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static double getVelocidadeFinal() {
		return VELOCIDADE_FINAL;
	}
	//este metodo retorna um endereço de memoria de um objeto de comprador, portanto, pode ser considerado
	//o proprio objeto da classe comprador, com acesso aos metodos e etc...
	public Comprador getComprador() {
		return comprador;
	}
	
	
	

}
