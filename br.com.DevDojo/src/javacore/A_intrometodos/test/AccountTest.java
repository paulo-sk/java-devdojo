package javacore.A_intrometodos.test;

import java.util.Scanner;

import javacore.A_intrometodos.classes.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Account conta = new Account("BotJAo",10);
		
	try {System.out.print("Nome: "+conta.name+", idade:"+conta.idade);
		System.out.println("\nDigite o novo nome: ");
		String nome = in.next();
		System.out.println("Digite a nova idade");
		int idade = in.nextInt();
		
		conta.setNameIdade(nome, idade);
		conta.getName();
		
	}finally {in.close();}
		
	}

}
