package excepciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Cometemos un error");
			throw new MiExcepcion();
		}catch (MiExcepcion e) {
			System.out.println(); //falta
		}
	}

}
