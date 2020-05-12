package javacore.L_interfaces.tests;

import javacore.L_interfaces.classes.Produto;

public class TestProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto("NootBook",2,4000);
		p.calculaFrete();
		p.calculaImposto();
		p.calculaValorFinal();
		System.out.println(p);
	}

}
