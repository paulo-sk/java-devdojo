package javaYcap2.exercicios;

import java.util.Scanner;

public class MileToKm2_1 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 mile = 1.6 km
		
		System.out.print("Convert Miles to Km. How much miles? ");
		double miles = entrada.nextDouble();
		
		double km = miles * 1.6;
		
		System.out.println(miles + " miles = " + km + " km");
	}

}