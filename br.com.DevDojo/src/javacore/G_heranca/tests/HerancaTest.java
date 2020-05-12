package javacore.G_heranca.tests;

import javacore.G_heranca.classes.Endereco;
import javacore.G_heranca.classes.Funcionario;
import javacore.G_heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("pk");
		Endereco end = new Endereco();
		
		end.setBairro("Bairro das cocaina");
		end.setRua("Rua Da ptria");
		
		p.setNome("Jhon");
		p.setCpf("112369-55");
		p.setEndereco(end);
		p.imprime();
		
		System.out.println("---------------------");
		
		Funcionario func = new Funcionario("pkLoco","230-1337");
		func.setNome("Louco da 10");
		//func.setCpf("157-1337");
		func.setEndereco(end);
		func.setSalario(133_700_0);
		func.imprime();
		

	}

}
