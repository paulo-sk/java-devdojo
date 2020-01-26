package javaYcap2.exercicios;
import java.util.Scanner;
public class GratitudeRate2_5 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the subtotal and the gratuity rate: ");
		double subtotal = 0, gratuity = 0;
		subtotal = entrada.nextDouble();
		gratuity = entrada.nextDouble();
		
		double total = subtotal + (subtotal * (gratuity/100));
		
		System.out.println("The gratuity is $"+ (total - subtotal) + " and total is $ "+ total);
	}

}
