package javacore.A_intrometodos.test;

import javacore.A_intrometodos.classes.Estudante2;

import java.util.*;

public class EstudanteTest2 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudante2 estudante = new Estudante2();
		
		System.out.print("Nome do estudante: ");
		estudante.setNome(entrada.next());
		
		System.out.print("idade do estudante: ");
		estudante.setIdade(entrada.nextInt());
		
		System.out.print("Matricula do estudante: ");
		estudante.setMatricula(entrada.next());
		
		System.out.print("Digite as 3 notas do estudante: ");
		estudante.setNotas(new double[] {entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()});
		estudante.imprime();
		estudante.tirarMedia();
		
		
		

	}

}
