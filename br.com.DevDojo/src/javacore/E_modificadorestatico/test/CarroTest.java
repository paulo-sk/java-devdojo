package javacore.E_modificadorestatico.test;

import javacore.E_modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro ("ferrari", 300);
		Carro c2 = new Carro ("porch", 287);
		Carro c3 = new Carro ("audi", 320);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
		Carro.setVelocidadeLimite(500); 
		System.out.println("\n####################");
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
	}

}
