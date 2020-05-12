package javacore.I_modificador_final.tests;

import javacore.I_modificador_final.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c = new Carro();
		// Carro.VELOCIDADE_FINAL = 400; iss nao pode ser feito
		c.setNome("R8");
		c.setMarca("Audi");
		
		//c.getComprador vai retornar , new Comprador() que é apenas o endereço do memoria do objeto
		//no caso, o que retorna o endereço de memoria é o metodo toString(), entao basta
		//sobrescrever esse metodo na classe comprador para que retorne os valores dos atributos
		//dessa classe
		System.out.println(c.getComprador().toString()); //so para lembrar mesmo.
		System.out.println(c.getComprador());
		
		c.getComprador().setNome("JK"); 
		c.getComprador().nome = "Kadwa";
		
		System.out.println(c.getComprador());
		
	}

}
