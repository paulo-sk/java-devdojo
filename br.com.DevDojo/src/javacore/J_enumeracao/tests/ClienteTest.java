package javacore.J_enumeracao.tests;

import javacore.J_enumeracao.classes.Cliente;
import javacore.J_enumeracao.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente("Louco da Norte", TipoCliente.PESSOA_FÍSICA,Cliente.TipoPagamento.A_VISTA);
		System.out.println(cliente);

	}

}
