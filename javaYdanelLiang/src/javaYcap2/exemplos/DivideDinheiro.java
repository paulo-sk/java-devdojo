package javaYcap2.exemplos;

import java.util.*;

public class DivideDinheiro {
	
	static Scanner entrar = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nao tem moedas de 50 centavos (copiando exemplo do livo)
		
		System.out.print("Digite um valor em dinheiro com ate 2 casas decimais: ");
		double dinheiro = entrar.nextDouble();
		
		int restanteDinheiro = (int) (dinheiro * 100);
		
		int dollar = restanteDinheiro / 100;
		restanteDinheiro = restanteDinheiro % 100;
		
		int vinteCincoCentavos = restanteDinheiro / 25;
		restanteDinheiro = restanteDinheiro % 25;
		
		int dezCentavos = restanteDinheiro / 10;
		restanteDinheiro = restanteDinheiro % 10;
		
		int cincoCentavos = restanteDinheiro / 5;
		restanteDinheiro = restanteDinheiro % 5;
		
		int umCentavo = restanteDinheiro;
		
		System.out.println(dinheiro + " dollars = ");
		System.out.println(dollar + " dollar. ");
		System.out.println(vinteCincoCentavos + " moedas de 25 centavos. ");
		System.out.println(dezCentavos + " moedas de 10 centavos. ");
		System.out.println(cincoCentavos + " moedas de 05 centavos. ");
		System.out.println(umCentavo + " moedas de 01 centavos. ");
		
		
	}

}
