package javacore.O_assertions.test;

public class AssertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculaSalario(855214);
		calculaSalario(-855); // 
	}
	
	private static void calculaSalario(double salario) {
		//para usar o assert, vc tem que habilita-lo no "vm argumets" que esá em "run configuration", com o comand -ea (enable asserts)
		//calculo com salario
		//obviamente, o salario nao pode ser negativo
		//sem o assert, vc tem que usar um if-else para saber se o salario é negativo
		//mas vc sabe que o salaio nunca pode ser negativo, se chegar a ser negativo, ta tudo errado.
		//o assert garante que o salario é sempre positivo, pois se não for, o programa da erro e para
		// assert (x) =  tenho certeza que x = true
		//sempre que usar assert, o metodo em que ele está inserido deverá ser private
		assert (salario > 0):"o salario nao deve ser menor que zero, salrio veio = "+salario;
		
	}
	
	//para metodos publicos, jogue uma exception, mas o padrao é usar um metodo private com assert
	public static void calcSalario(double salario) {
		if (salario < 0)
			throw new IllegalArgumentException();
	}

}
