package excepciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		MiExcepcion excepcion = new MiExcepcion();
		
		int numero = excepcion.RecogerOpcionInt(reader,0,100, "Introduce número entre 0 y 100");
		
		try {
			System.out.println("Cometemos un error");
			throw new MiExcepcion();
		}catch (MiExcepcion e) {
			System.out.println(e.ExceptionError()); 
		}
		
		
	}

}
