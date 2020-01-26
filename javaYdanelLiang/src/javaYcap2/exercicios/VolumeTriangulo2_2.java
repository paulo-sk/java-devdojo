package javaYcap2.exercicios;

import java.util.Scanner;

public class VolumeTriangulo2_2 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// calcula area e volume de um triangulo equilatero
		
		//area = (raiz de 3 / 4) * l*l
		//volume = area * lado
		
		System.out.print("Digite o lado de um triangulo equilatero: ");
		double lado = entrada.nextDouble();
		
		double area = (Math.pow(lado, 2) * Math.pow(3, 0.5)) / 4 ;
		double volume = area * lado;
		
		System.out.println("Area = " + area);
		System.out.println("Volume = " + volume);
	}

}
