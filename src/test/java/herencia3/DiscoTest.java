package herencia3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {
	private String titulo= "Interestelar";
	private String autor = "Autor";
	private String formato = "desconocido";
	private float duracion = 120;
	private String generos = "ROCK";
	private Disco disco = new Disco(titulo, autor, formato, duracion, generos);
	 
	@Test
	public void testConstructorDisco() {
		Disco discoPrueba = new Disco(titulo, autor, formato, duracion, generos);	
		assertEquals(generos, discoPrueba.getGeneros());

	}
	@Test
	public void testGeneros() {
		disco.setGeneros(generos); 
		assertEquals(generos,disco.getGeneros()); 
	}
	
	@Test
	public void testToString() {
		String resultado = disco.toString();
		String expected = " Título: " + titulo + " Autor: " + autor + " Formato: " + formato + " Duración: " + duracion+ " Genero: " + generos; 
		assertEquals(expected,resultado);
	}
}
