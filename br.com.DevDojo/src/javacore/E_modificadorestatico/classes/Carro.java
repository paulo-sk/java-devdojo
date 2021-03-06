package javacore.E_modificadorestatico.classes;

public class Carro {
	

	private String nome;
	private double velocidadeMaxima;
	//static torna o atributo ou metodo pertencente à classe e não ao objeto
	//todo atributo static é compartilhado com todos os objetos criados dessa class
	static private double velocidadeLimite = 240;
	
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		
	}
	
	public void imprime() {
		System.out.println("-------------------------------	");
		System.out.println("Nome: "+this.nome);
		System.out.println("velocidade Maxima: "+this.velocidadeMaxima);
		System.out.println("Velocidade Limite: "+Carro.velocidadeLimite);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
}
