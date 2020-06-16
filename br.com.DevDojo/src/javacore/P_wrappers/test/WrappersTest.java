package javacore.P_wrappers.test;

public class WrappersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipos primitivos: total = 8, 6 de tipo numerico, 2 de tipo caracter
		byte bytePrimitive = 1;
		short sortPrimitive = 1;
		int intPrimitive = 10;
		long longPrimitive = 10L;
		float floatPrimitive = 10.2f;
		double doublePrimitive = 20.3;
		char charPrimitive = 'a';
		boolean booleanPrimitve = true;
		
		//classes wrappers serve para dar mais poder aos tipos primitivos, transfomando eles em objetos
		//wrappers "encapsulam" os tipos pritivos.
		//o nome das classes wrappers sao os mesmos dos tipos primitivos, mas com primeira letra maiuscula e 
		//o nome completo (no caso int = Integer e char = Character)
		
		Byte byteWrapper = 1;
		Short shorWrapper = 2;
		Integer intWrapper = 3;
		Long longWrapper = 4L;
		Float floatWrapper = 10f;
		Double doubleWrapper = 30D;
		Character charWrapper = 'A';
		Boolean boolWrapper = true;
		
		/*no caso das classes Wrappers, a partir do integer ate o double, o java nao faz o casting implicito como nos tipos primitivos
		 * normalmente, pois todas essas classes wrappers numericas, sao filhas da classe Number, e por tanto, não tem relaçao de
		 * mae e filha entre elas, pois sao classes irmas
		 * se vc tentar colocar Long longWraper = 2, é a mesma coisa de vc dizer para a classe Long receber um objeto Integer ou Short ou Byte
		 * por isso cada valor tem que ser explicitamente definido para sua classe*/
		
		
	}

}
