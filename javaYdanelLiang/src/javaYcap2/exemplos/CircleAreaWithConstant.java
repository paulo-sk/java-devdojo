package javaYcap2.exemplos;

import java.util.*;

public class CircleAreaWithConstant {

	public static Scanner entrada = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//final = variavel constante
		//constantes devem ser escritar em UPPERcase separadas com _
		final double PI = 3.14159;
		
		System.out.print("Digite o raio do circulo: ");
		double raio = entrada.nextDouble();
		
		double area = raio * raio * PI;
		
		System.out.println("A area do circulo com raio " + raio + " = " + area);
	}

}
