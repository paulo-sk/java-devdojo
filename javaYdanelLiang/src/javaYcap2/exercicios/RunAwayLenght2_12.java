package javaYcap2.exercicios;

import java.util.Scanner;

public class RunAwayLenght2_12 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		//Calcular distantica minima para o aviao sair do chao
		// lenght = (v*v) / 2a
		
		System.out.println("Enter the speed and acceleration of the airplane: ");
		double speed = entrada.nextDouble();
		double acceleration = entrada.nextDouble();
		
		double lenght = Math.pow(speed, 2) /  (2  * acceleration);
		
		System.out.printf("The minimum runaway lenght for this airplane is %.3fm.", lenght);
	}

}