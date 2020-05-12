package javaYcap2.exercicios;

import java.util.Scanner;

public class MultiplicarDigitos2_6 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// //entre 0 e 1000 = 1 ate 999
		System.out.println("Digite um numero inteiro entre 0 e 1000: ");
		int numero = entrada.nextInt();
		
		/*Primeira souluçao, vai pegando os numeros da esquerda pra direita
		 *	int n1 = numero / 100;
			numero = numero % 100;
			int n2 = numero / 10;
			int n3 = numero % 10; 
		 * */
		
		//segunda solucao, numeros da direita pra esquerda
		int n1 = numero % 10;
		int n2 = (numero / 10) % 10;
		int n3 = numero / 100;
		
		
		System.out.println("Multiplicaçao dos digitos "+n3+n2+n1+" = "+(n1*n2*n3));
		
		
	}

}
