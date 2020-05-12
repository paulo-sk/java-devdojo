package javaYcap3.exemplos;
import java.util.Scanner;

public class AdditionQuiz {
	
	static Scanner enter = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() /10 % 10);
		
		System.out.println("What is "+ number1 +" + "+number2+" ?");
		
		int answer = enter.nextInt();
		
		System.out.println(number1 +" + "+number2+" = "+answer+" is "+(number1 + number2 == answer));
		
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		System.out.println(x);
	}

}
