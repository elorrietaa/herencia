package ejercicio71;

import static org.junit.Assert.*;

import org.junit.Test;

public class GriegoTest extends GuerreroTest {
	protected String nombre="Guerrero1";
	protected int edad=23;
	protected int fuerza=5;
	protected boolean herido=false;
	protected boolean muerto=false;
	
	protected Guerrero guerrero = new Guerrero(nombre, edad, fuerza);
	
	@Test
	public final void testGriegoStringIntInt() {
		Griego griegoprueba = new Griego("Griego2", 20, 5);
	}

	@Test
	public final void testGriego() {
		Griego griegoprueba2 = new Griego("GriegoX", 20, 8);
		assertEquals(griegoprueba2.getNombre(), "GriegoX");
		assertEquals(griegoprueba2.getEdad(), 20);
		assertEquals(griegoprueba2.getFuerza(), 8);
	
	}
	
	@Test
	public final void testRetirarse() {
		
	}

}
