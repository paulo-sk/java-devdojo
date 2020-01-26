package javaYcap2.exercicios;

import java.util.*;

public class HeatWater2_10 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// calcular quantidade de energia para esquentar a agua
		
		//Q = M * (finalTemperature – initialTemperature) * 4184
		
		
		System.out.println("Enter the amount of water in kilograms: ");
		double massaAgua = entrada.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = entrada.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemperature = entrada.nextDouble();
		
		double q = massaAgua * (finalTemperature - initialTemperature) * 4184;
		
		System.out.printf("The energy needed is %.1f joules.",q);
	}

}
