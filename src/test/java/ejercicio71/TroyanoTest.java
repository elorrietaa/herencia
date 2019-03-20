package ejercicio71;

import static org.junit.Assert.*;

import org.junit.Test;

public class TroyanoTest extends GuerreroTest {
	protected String nombre="Guerrero1";
	protected int edad=23;
	protected int fuerza=5;
	protected boolean herido=false;
	protected boolean muerto=false;
	
	protected Guerrero guerrero = new Guerrero(nombre, edad, fuerza);
	Troyano troyanoprueba = new Troyano(nombre, edad, fuerza);

	@Test
	public final void testConstructor() {
		Griego griegoprueba1 = new Griego();
		assertEquals(griegoprueba1.getNombre(), "GriegoX");
		assertEquals(griegoprueba1.getEdad(), 20);
		assertEquals(griegoprueba1.getFuerza(), 8);
	}
	
	@Test
	public  void testRetirarse() {
		Griego griegoprueba2 = new Griego();
		assertEquals(griegoprueba2.retirarse(), false);
	}
}