package javacore.E_modificadorestatico.test;

import javacore.E_modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		// Variaveis de classe podem ser chamadas antes de criar qualquer objeto.
		System.out.println(Carro.getVelocidadeLimite());
		
		Carro c1 = new Carro ("ferrari", 300);
		Carro c2 = new Carro ("porch", 287);
		Carro c3 = new Carro ("audi", 320);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
		//o jeito correto de mudar o valor de atributo static (de classe) é chamar o metodo pelo nome da propria classe
		Carro.setVelocidadeLimite(500); 
		c1.imprime();
		System.out.println("\n####################");
		
		//mas vc tambem pode alterar uma variavel de class pelo nome do objeto, mas não é recomendado
		c1.setVelocidadeLimite(340);
		c1.imprime();
		
		c2.setVelocidadeLimite(440);
		c2.imprime();
		
		c3.setVelocidadeLimite(540);
		c3.imprime();
	}

}
