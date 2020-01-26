package javacore.B_sobrecargametodos.test;

import javacore.B_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.init("Chica", "222.333.455-10", 7000);
		funcionario.init("@@@@@33333");
		
		funcionario.print();
	}
}
