package javacore.B_sobrecargametodos.test;

import javacore.B_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.init("Chicai","213889-123",12000); // sem rg
		funcionario.print();
		
		System.out.println("-------------------------------------------");
		
		funcionario.init("Chicai","213889-123",12000,"234.42.45"); // com rg
		funcionario.print();
		
	
		//veja que ambos os metodos funcionam. O "mesmo" metodo aceita um argumento a mais ou a menos.
		//por que fiz um overload
		//e posso fazer quantos overload eu quiser.
		
		System.out.println("-------------------------------------------");
		funcionario.init("Chicai","213889-123",12000,"234.42.45",19);
		funcionario.print();
		
	}
}
