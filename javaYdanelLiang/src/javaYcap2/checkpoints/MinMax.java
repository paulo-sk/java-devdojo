package javaYcap2.checkpoints;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("valores Minimos e maximos de alguns tipos de dados: \n");
		
		byte bMinByte = Byte.MIN_VALUE;
		byte bMaxByte = Byte.MAX_VALUE;
		System.out.println("byte minimal value: "+bMinByte);
		System.out.println("byte maximal value: "+bMaxByte);
		
		System.out.println("----------------------------------------------");
		
		short sMinValue = Short.MIN_VALUE;
		short sMaxValue = Short.MAX_VALUE;
		System.out.println("short minimal value: "+sMinValue);
		System.out.println("short maximal value: "+sMaxValue);
		
		System.out.println("----------------------------------------------");
		
		int iMinValue = Integer.MIN_VALUE;
		int iMaxValue = Integer.MAX_VALUE;
		System.out.println("integer minimal value: "+iMinValue);
		System.out.println("integer maximal value: "+iMaxValue);
		
		System.out.println("----------------------------------------------");
		
		long lMinValue = Long.MIN_VALUE;
		long lMaxValue = Long.MAX_VALUE;
		System.out.println("long minimal value: "+lMinValue);
		System.out.println("long maximal value: "+lMaxValue);
		
		System.out.println("----------------------------------------------");
		
		float fMinValue = Float.MIN_VALUE;
		float fMaxValue = Float.MAX_VALUE;
		System.out.println("float minimal value: "+fMinValue);
		System.out.println("float maximal value: "+fMaxValue);
		
		System.out.println("----------------------------------------------");
		
		double dMinValue = Double.MIN_VALUE;
		double dMaxValue = Double.MAX_VALUE;
		System.out.println("double minimal value: "+dMinValue);
		System.out.println("double maximal value: "+dMaxValue);
		
		//vc pode seprar os numeros por casas decimais com o underscore
		System.out.println(5_2534e+1);
		System.out.println(5_2);
	
	}

}
