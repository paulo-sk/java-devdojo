package javacore.Q_strings.test;

public class StringTest {

	public static void main(String[] args) {
		
		//alguns metodos de string
		String test = "Goku";
		System.out.println(test.charAt(0)); 
		
		String test2 = "   goku1337    ";
		System.out.println(test2.equalsIgnoreCase(test)); //verifica se test2 = test ignorando o caseSensitive.
		
		System.out.println(test.length()); //no array, o lenght é um atributo, aqui na string é um metodo,por isso os parenteses
		
		System.out.println(test2.replace('g', 'F')); //troca todos os g por F
		
		System.out.println(test2.toUpperCase());
		
		System.out.println(test2.substring(1,4)); //primeiro parametro começa da posiçao 0, o segundo começa do 1 e vai ate o valor colcado
		System.out.println(test2.trim()); //elimina os espaços vazios da esquerda e direita (esse método é muito importante).
		
	}

}
