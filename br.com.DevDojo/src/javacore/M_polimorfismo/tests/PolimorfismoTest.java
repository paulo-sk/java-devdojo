package javacore.M_polimorfismo.tests;

import javacore.M_polimorfismo.classes.Funcionario;
import javacore.M_polimorfismo.classes.Gerente;
import javacore.M_polimorfismo.classes.RelatorioPagamento;
import javacore.M_polimorfismo.classes.Vendedor;

public class PolimorfismoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente("Louco",5000,2000);
		Vendedor p = new Vendedor("Yurih",2000,20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		
		/*
		 * relatorio.relatorioPagamentoGerente(g);
		 * System.out.println("-------------------------------------------------");
		 * relatorio.relatorioPagamentoVendedor(p);
		 */
		
		relatorio.relatorioPagamenteGenerico(g);
		System.out.println("---------------------------------");
		relatorio.relatorioPagamenteGenerico(p);
		
		//casting de variavel de referencia
		//f so tem acesso aos metodos e atributos em que esteja disponível em ambas as classes;
		Funcionario f = g;
		// Vendedor p2 = g; isso nao converte
		//esse casting so funciona de uma superclass para uma sub
		System.out.println("\n-------------- Funcionario f acessando valores de um objeto de Grente g --------------------");
		System.out.println(f.getSalario());
	}

}
