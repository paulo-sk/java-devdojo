package javacore.Q_strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String s = "Uma frase comum";
		
		StringBuilder sb = new StringBuilder(); //sem argumento, o valor default e 16
		
		sb.append(s);
		sb.append(" novamente.");
		
		s = sb.toString(); //vc pode fazer isso, pois passa o valor do objeto para string
		
		System.out.println(sb.toString());
		System.out.println(s);
		
		//alguns metodos do StringBuilder.
		System.out.println(sb.reverse()); //esse metodo reverte a string permanentemente.
		System.out.println(sb.toString());
		int i = 0;
		String string = "";
		string += i;
	}

}
