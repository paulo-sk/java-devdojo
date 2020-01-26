package javacore.E_modificadorestatico.classes;

public class Cliente {
	//Ordem de execuçao
	//1 - alocar espaço na memoria para o objeto a ser executado
	//2 - inicializa os atriutos com os valores default
	//3 - inicializa o bloco de inicialização
	//4 - executa o construtor
	
	private static int[] parcelas;

	//o bloco de inicializaçao static é executado apenas uma vez assim quando a classe é iniciada com ou sem objeto
	static{
		parcelas = new int[100];
		System.out.println("Dentreo do bloco de inicialização");
		for(int i = 1; i <=100; i++) {
			parcelas[i-1] = i;
		}
	}
	
	static {
		System.out.println("Bloco static 2");
	}
	
	static {
		System.out.println("Bloco static 3");
	}
	
	{
		System.out.println("Bloco nao estatico");
	}
	
	
	public Cliente() {
		
	}	
	
	public static int[] getParcelas() {
		return parcelas;
	}

	public static void setParcelas(int[] parcelas) {
		Cliente.parcelas = parcelas;
	}
	
}
