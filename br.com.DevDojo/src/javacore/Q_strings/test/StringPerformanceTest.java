package javacore.Q_strings.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		
		//sem StringBuilder
		long inicio = System.currentTimeMillis();
		concatString(10000);
		long fim = System.currentTimeMillis();
		System.out.println("tempo gasto string: "+(fim-inicio)+ "ms.");
		
		System.out.println("-----------------------------------");
		
		//com StringBuilder
		inicio = System.currentTimeMillis();
		concatStringBuilder(100000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto StringBuilder: "+(fim-inicio)+ "ms.");
		
		System.out.println("-----------------------------------");
		
		// com StringBuffer
		inicio = System.currentTimeMillis();
		concatStringBuffer(100000);
		fim = System.currentTimeMillis();
		System.out.println("tempo gasto StringBuffer: " + (fim - inicio) + "ms.");
		
		/*A performance do StringBuilder e teoricamente melhor do que a do StringBuffer, mas ambas são da mesma classe,
		 *por isso a performance de ambas são semelhantes;
		 * StringBuffer é mais usado quando se envolve Threads*/
	}
	
	public static void concatString(int tam) {
		String string = "";
		for(int i =0; i < tam; i++) {
			string += i;
		}
		//esse codigo criar tantos valores de string quanto o argumento do metodo, causando uma má performance
	}
	
	public static void concatStringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for(int i =0; i < tam; i++) {
			sb.append(i);
		}
		//esse codigo criar tantos valores de string quanto o argumento do metodo, causando uma má performance
		
	}

	public static void concatStringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
		// esse codigo criar tantos valores de string quanto o argumento do metodo,
		// causando uma má performance
		
	}
}
