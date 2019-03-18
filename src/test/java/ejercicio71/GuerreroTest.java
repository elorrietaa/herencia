package ejercicio71;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class GuerreroTest {
	//atributos:
		protected String nombre="Guerrero1";
		protected int edad=23;
		protected int fuerza=5;
		protected boolean herido=false;
		protected boolean muerto=false;
		
		protected Guerrero guerrero = new Guerrero(nombre, edad, fuerza);
		
		//constructor
		@Test
		public void testConstructorGuerrero1() {
			Guerrero guerreroprueba = new Guerrero("Guerrero1", 23, 5);
			assertEquals(nombre, guerrero.getNombre());
			assertEquals(edad, guerrero.getEdad());
			assertEquals(fuerza, guerrero.getFuerza());
		}
		//constructor que contempla otros casos de prueba:
		@Test
		public void testConstructorGuerrero2() {
			Guerrero guerreroprueba = new Guerrero("Guerrero1", 500, 50);
			assertEquals(nombre, guerrero.getNombre());
			assertEquals(edad, guerrero.getEdad());
			assertEquals(fuerza, guerrero.getFuerza());
		}
		@Test
		public void testNombre() {
			guerrero.setNombre(nombre); 
			assertEquals(nombre,guerrero.getNombre()); 
		}
		@Test
		public void testEdad() {
			guerrero.setEdad(edad); 
			assertEquals(edad,guerrero.getEdad()); 
		}
		
		@Test
		public void testFuerza() {
			guerrero.setFuerza(fuerza); 
			assertEquals(fuerza,guerrero.getFuerza()); 
		}
		
		@Test
		public void testIsHerido() {
			guerrero.isHerido();
			guerrero.setHerido(herido);
		}
		@Test
		public void testIsMuerto() {
			guerrero.isMuerto();
			guerrero.setMuerto(muerto);
		}
		@Test
		public final void testRetirarse() {
			assertEquals(false, guerrero.retirarse());
		}
		
		
}
