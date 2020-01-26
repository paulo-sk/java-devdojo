package javaYcap2.exemplos;
import java.util.*;

public class DiaSemana {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Consideranda os dias da semana de 0 a 6, qual dia vc esta?");
		int dia = in.nextInt();
		
		verificaDia(dia);
		
		System.out.println("Daqui quantos dias vc deseja saber o dia da semana?");
		int quantosDias = in.nextInt();
		
		dia = dia + (quantosDias % 7);
		
		System.out.print("Esse dia sera uma: ");
		verificaDia(dia);
	}
	
	public static void verificaDia(int dia) {
		
		if(dia == 0) {
			System.out.println("domingo");
		}

		else if(dia == 1) {
			System.out.println("segunda");
		}
		
		else if(dia == 2) {
			System.out.println("terça");
		}
		
		else if(dia == 3) {
			System.out.println("quarta");
		}
		
		else if(dia == 4) {
			System.out.println("quinta");
		}

		else if(dia == 5) {
			System.out.println("sexta");
		}
		
		else if(dia == 6){
			System.out.println("sabado");
		}


	}

}
