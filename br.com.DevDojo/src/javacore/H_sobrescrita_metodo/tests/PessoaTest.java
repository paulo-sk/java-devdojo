package javacore.H_sobrescrita_metodo.tests;

import javacore.H_sobrescrita_metodo.classes.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		
		p.setNome("Loko");
		p.setIdade(255);
		//o metodo toString e implicitamente chamado quando colocamos so o nome do objeto
		//e foi sobrescrito para retornar valores dos atributos, e contina sendo chamado implicitamente
		System.out.println(p);

	}

}
