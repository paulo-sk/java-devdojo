package javacore.N_exceptions.runtimeexception.test;

import java.nio.channels.AlreadyBoundException;

public class MultiplasRuntimeExceptions {

	public static void main(String[] args) {
		
		try {
			//throw new ArrayIndexOutOfBoundsException();
			throw new AlreadyBoundException();
		//sempre colocar as excecoes mais especificas primeiro.
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro de ArrayIndexOutOfBoundsException.");
			
		}catch(IllegalArgumentException e) {
			System.out.println("Dentro de IllegalArgumentException.");
		}catch(ArithmeticException e) {
			System.out.println("Dentro de ArithmeticException.");
		}
	}

}
