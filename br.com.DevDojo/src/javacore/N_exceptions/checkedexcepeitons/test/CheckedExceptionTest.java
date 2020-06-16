package javacore.N_exceptions.checkedexcepeitons.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		criarArquivo();
	}
	
	public static void criarArquivo() {
		File file = new File("teste.txt");
		try {
			System.out.println("Arquivo foi ciado? : "+file.createNewFile());
			//se der erro acima, nada abaixo será executado.(dentro do try)
		} catch (IOException e) {
			//retorna informaçoes do erro
			e.printStackTrace();
		}
		//com o tray catch, o codigo continua rodando, e mostra o erro no final
		System.out.println("Fora do bloco catch.");
	}
}
