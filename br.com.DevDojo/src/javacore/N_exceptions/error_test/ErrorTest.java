package javacore.N_exceptions.error_test;

public class ErrorTest {

	public static void main(String[] args) {
		//erros nao podem ser tratados
		
		//stackOverflowErro();
		main(args);
	}
	
	public static void stackOverflowErro() {
		//erro de recursão
		stackOverflowErro();
	}
}
