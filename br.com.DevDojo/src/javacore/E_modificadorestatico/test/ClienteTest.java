package javacore.E_modificadorestatico.test;

import javacore.E_modificadorestatico.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		
		System.out.println();
		System.out.println("Representanda quantidade de parcelas possiveis");
		
		for(int parcela: Cliente.getParcelas()) {
			System.out.print(parcela +" ");
		}

	}

}
