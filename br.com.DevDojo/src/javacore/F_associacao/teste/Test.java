package javacore.F_associacao.teste;

import javacore.F_associacao.classes.Estudante;
import javacore.F_associacao.classes.Professor;
import javacore.F_associacao.classes.Seminario;
import javacore.F_associacao.classes.Local;

public class Test {
	
	public static void main(String[] args) {
		Professor professor1 = new Professor("Fnx","Major Win");
		
		Estudante estudante1 = new Estudante("apk",17);
		Estudante estudante2 = new Estudante("bakemono",27);
		
		Seminario seminario1 = new Seminario("Como ser dope elevando suas skills:");
		
		Local local1 = new Local("Dope","Skills");
		
		seminario1.setEstudantes(new Estudante[] {estudante1,estudante2});
		seminario1.setProfessor(professor1);
		seminario1.setLocal(local1);
		seminario1.imprime();
		
		System.out.println("================================================\n");
		
		professor1.setSeminarios(new Seminario[] {seminario1});
		professor1.imprime();
		System.out.println("================================================\n");
		
		estudante1.setSeminario(seminario1);
		estudante1.imprime();
		System.out.println("================================================\n");
		
		estudante2.setSeminario(seminario1);
		estudante2.imprime();
		
		
	}
	

}
