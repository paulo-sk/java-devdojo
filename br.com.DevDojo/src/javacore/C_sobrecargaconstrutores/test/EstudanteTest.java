package javacore.C_sobrecargaconstrutores.test;

import javacore.C_sobrecargaconstrutores.classes.Estudante;
import java.util.*;

public class EstudanteTest {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main() {
		// TODO Auto-generated method stub
		Estudante estudante1 = new Estudante("jao","1534234-222-355", new double[] {5,7,9}); //sem data matricula
		estudante1.setMatricula("12233.1314-12");
		estudante1.imprime();
		
		System.out.println("----------------------------------");
		
		Estudante estudante2 = new Estudante("dawd","238801-1331",new double[] {entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()},"MA-129166-13");//com data matricula + entrada de notas pelo usuario
		estudante2.imprime();
		
		System.out.println("----------------------------------");

		Estudante estudante3 = new Estudante(); //sem nem um argumento
		estudante3.setNome("Apdk");
		estudante3.setMatricula("23-989413245");
		estudante3.setNotas(new double[] {entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble()});
		estudante3.setDataMatricula("23/432/155654");
		estudante3.imprime();
		
		//isso somente é possivel por conta das sobrecargas de construtores
	}

}
