package javaYcap2.exercicios;

import java.util.Scanner;

public class NumbersYers2_7 {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Converter minutos em anos, dias, horas e minutos
		//Tirei os meses para simplificar, pois tem meses com dias diferentes
		
		System.out.print("Enter the number of minutes: ");
		int minutes = entrada.nextInt();
		
		//60 minutos = 1 hora
		//24 horas = 1 dia
		//365 dias = 1 ano
		
		int horas = minutes / 60;
		int minutesRestante = minutes % 60;
		
		int dias = horas / 24;
		int horastante = horas % 24;
		
		int anos = dias / 365;
		int diasRestantes = dias % 365;
		
		System.out.println(minutes + " minutes é aproximadamente " + anos + " anos, " + diasRestantes + " dias, " + horastante 
				+ " horas e " + minutesRestante + " minutos.");
		

	}

}
