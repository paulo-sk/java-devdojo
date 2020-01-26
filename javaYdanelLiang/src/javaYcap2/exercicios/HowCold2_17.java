package javaYcap2.exercicios;

import java.util.*;

public class HowCold2_17 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 *How cold is it outside? The temperature alone
			is not enough to provide the answer. Other factors including wind speed, relative
			humidity, and sunshine play important roles in determining coldness outside.			
		 */
		
		System.out.print("Enter the temperature in fahrenheit between -58°F and 41°F: ");
		double ta = in.nextDouble();
		System.out.print("\nEnter the wind spee ( >= 2) in mile per hour: ");
		double v = in.nextDouble();
		
		double temperature = 35.74 + (0.6215*ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
		System.out.printf("The wind chill  index is %.5f.", temperature);

	}

}
