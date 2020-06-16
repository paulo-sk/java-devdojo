package javacore.N_exceptions.checkedexcepeitons.test;

import java.io.File;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		/*
		 * try { criarArquivo(); }catch(IOException e) { e.printStackTrace(); }
		 */
		
		abrindoArquivo();
	}
	
	//o throws joga a responsabilidade de tratar a excecao para o metodo que esta chamando.
	public static void criarArquivo() throws IOException {
		File arquivo = new File("teste.txt");
		try {
			System.out.println("Arquivo criado? : "+ arquivo.createNewFile());
			System.out.println("Arquivo criado.");
		}catch(IOException e) {
			e.printStackTrace();
			//caso ainda nao seja tratado, sera jogado para onde esse metodo esta sendo chamado.
			throw e;
		}
		
		
	}
	
	public static String abrindoArquivo(){
		try {
			System.out.println("Abrindo um arquivo.");
			System.out.println("Executando a leitura do arquivo...");
			//throw new Exception(); //aqui lança uma exceptiom e os codigos abaixos sao inalcançaveis
			System.out.println("Escrevendo no arquivo...");
			//System.out.println("Fechar o arquivo..."); // aqui ja pode nao rodar por erros que podem occorer antes, por isso deve ser
			//fechado os arquivos, no bloco finally
			return "valor";
		}catch(Exception e) {
			System.out.println("Dentro do catch...");
			e.printStackTrace();
			
		}finally {
			//o bloco finally sempre é executado, por isso temos certeza de que o arquivo ou conexao será fechado
			System.out.println("Fechando o arquivo...");
			
		}
		return "valor";
		
	}
}
