package javacore.D_blocoinicializacao.classes;

public class Cliente {
	//Ordem de execuçao de uma class
	//1 - alocar espaço na memoria para o objeto a ser executado
	//2 - inicializa os atriutos com os valores default ou valores explícitos
	//3 - inicializa o bloco de inicialização (mesmo que vc coloque depois do constructor, ele sera inicia primeiro)
	//4 - inicializa o construtor
	
	private int[] parcelas;


	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicialização");
		for(int i = 1; i <=100; i++) {
			parcelas[i-1] = i;
		}
	}
	
	
	public Cliente() {
		
	}	
	
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
}
