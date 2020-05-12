package javacore.K_classes_abstratas.tests;

import javacore.K_classes_abstratas.classes.Gerente;
import javacore.K_classes_abstratas.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendedor v = new Vendedor("ana","23088-123",1500,5000);
		Gerente g = new Gerente("maluco","23991-13",2000);
		
		g.calculaSalario();
		v.calculaSalario();
		
		System.out.println(v);
		System.out.println(g);
		
	}

}
