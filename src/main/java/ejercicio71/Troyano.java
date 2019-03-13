package ejercicio71;

public class Troyano extends Guerrero{
	//atributos
	//constructor1
	public Troyano(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
	}
	//constructor2
	public Troyano() {
		super("TroyanoX", 18, 10);
	}
	
	//métodos:
	@Override
	public boolean retirarse() {
		System.out.println("Los Guerreros Troyanos NUNCA se retiran!!!");
		return false;
	}
}
