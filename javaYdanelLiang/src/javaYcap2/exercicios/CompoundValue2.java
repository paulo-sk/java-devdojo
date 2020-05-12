package javaYcap2.exercicios;
import java.util.Scanner;

public class CompoundValue2 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*juros compostos
		 * exemplo, se a taxa anual e de 3,75%,
		 * a taxa mensal sera de 0.0375/12 = 0.003125 = i
		 * Regra de juros sobre juros:
		 * ex, a etrada de RS 100 todo mes....
		 * 100 + 100*i = tantos
		 * (tantos + 100) + (tantos * i) = tantos2
		 * (tantos2 + 100) * (1 + i) = tantos3
		 * De o valor de tantos ao final de 6 meses.
		 * */
		
		System.out.println("Valor de juros sobre juros ao ano e de 3,75%. = 0.3125 % ao mes: ");
		//taxa = 0.003125
		
		System.out.println("Entre com o valor que sera adicionado mensalmenta à conta: ");
		double mesDeposito = entrada.nextDouble();
		
		System.out.println("Digite o tempo de aplicaçao em meses: ");
		int meses = entrada.nextInt();
		
		double juros = 0;
		double accountValue = 0;
		int count = 1;
		
		for(int i = 0; i < meses; i++) {
			accountValue = (mesDeposito + juros) * (0.003125 + 1);
			juros = accountValue;
			System.out.println("After the "+count+"° month, the account value is = $"+accountValue);
			count++;
		}
		
		

	}

}
