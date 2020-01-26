package javaYcap2.exercicios;

import java.util.*;

public class MetersToFeet2_3 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Metros para pes
		//1 metro = 3.2786
		
		System.out.print("Entre com a quantidade de metros: ");
		double metros = entrada.nextDouble();
		
		double pes = metros * 3.2786;
		
		System.out.println(metros + " metros =  " + pes + " pes." );

	}

}
