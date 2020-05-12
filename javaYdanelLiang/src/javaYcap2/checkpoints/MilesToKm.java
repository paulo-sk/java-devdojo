package javaYcap2.checkpoints;
import java.util.Scanner;


public class MilesToKm {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How  much miles? ");
		double miles = input.nextDouble();
		double KILLOMETERS_PER_MILES = 1.609;
		double kilometers = miles * KILLOMETERS_PER_MILES;
		
		System.out.println("Kilometers: "+kilometers);
		
		
	}

}
