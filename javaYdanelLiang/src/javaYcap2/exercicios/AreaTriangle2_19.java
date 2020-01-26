package javaYcap2.exercicios;

import java.util.*;
public class AreaTriangle2_19 {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//recebe 3 pontos em um plano (6 valores) e calcula a area do triangulo
		
		System.out.println("Enter the coordinates  of three  points separeted with spaces like: ");
		System.out.print("\nx1 y1 x2 y2 x3 y3: ");
		
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		//distancia entre 2 pontos; discancias = lados
		double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double side2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.printf("The area  of the triangule is %.1f.", area);
		
		

	}

}
