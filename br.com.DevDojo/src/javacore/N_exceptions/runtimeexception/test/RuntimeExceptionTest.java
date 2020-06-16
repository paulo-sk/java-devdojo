package javacore.N_exceptions.runtimeexception.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = null; 
		//int a = 10 / 0;
		//System.out.println(a);
		
		//tipos de erro RunTimeExceptiom são UNCHECKED, e devem ser modificados, pois geralmente
		//aparecem por erro do programador.
		//System.out.println(o.toString());
		
		//NullPointerException: quando uma variavel de referencia tenta executar um metodo 
		//de um objeto que nao foi criado...	
		
		try {
			int[] i = new int[3];
			System.out.println(i[3]);
			//a linha abaixo nao sera executada pois o erro ocorreu antes
			System.out.println("Imprimindo depois da possivel excecao.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//a vantagem de usar o try catch, é que o codigo nao para, mostrando o erro apenas no final
		System.out.println("Fora do blocl catch.");
	}	

}
