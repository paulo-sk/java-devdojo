package javacore.E_modificadorestatico.test;

import javacore.C_sobrecargaconstrutores.test.EstudanteTest;

public class CarroTest2 {

	public static void main(String[] args) {
		
		print();
		
		

	}
	
	public static void print() {
		
		System.out.print("Digite um numero: ");
		int a = EstudanteTest.entrada.nextInt();
		System.out.println(a);
		
	}

}
