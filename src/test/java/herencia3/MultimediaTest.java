package herencia3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultimediaTest {

	//atributos
	private String titulo= "Interestelar";
	private String autor = "Autor";
	private String formato = "desconocido";
	private float duracion = 120;
	
	private Multimedia multimedia = new Multimedia (titulo, autor, formato, duracion); 
	private Multimedia multimedia1 = new Multimedia ("Interestelar", "Interestelar", formato, duracion); 
	private Multimedia multimedia2 = new Multimedia ("Interestelar", "Luis", formato, duracion); 
	
	@Test
	public void testContructorMultimedia() {
		Multimedia multimediaPrueba = new Multimedia(titulo, autor, formato, duracion);
		assertEquals(titulo, multimediaPrueba.getTitulo());
		assertEquals(autor, multimediaPrueba.getAutor());
		assertEquals(formato, multimediaPrueba.getFormato());
		assertEquals(duracion, multimediaPrueba.getDuracion(), 0.1);
	}
	
	@Test
	public void testTitulo() {
		multimedia.setTitulo(titulo);
		assertEquals(titulo,multimedia.getTitulo());
	}
	
	@Test
	public void testAutor() {
		multimedia.setAutor(autor);
		assertEquals(autor,multimedia.getAutor());
	}
	
	@Test
	public void testFormato() {
		multimedia.setFormato(formato);
		assertEquals(formato,multimedia.getFormato());
	}
	
	@Test
	public void testDuracion() {
		multimedia.setDuracion(duracion);
		assertEquals(duracion, multimedia.getDuracion(), 0.2);
	}
	
	//métodos
	@Test
	public void testEquals() {
		boolean booleanEsperado=true;
		assertEquals(booleanEsperado, multimedia.equals(multimedia1));	 	
	}
	
	@Test
	public void testNotEquals() {
		boolean booleanEsperado=true;
		assertNotEquals(booleanEsperado, multimedia.equals(multimedia2));	 	
	}
	
	@Test
	public void restToString() {
		String resultado = multimedia.toString();
		String expected = " Título: " + titulo + " Autor: " + autor + " Formato: " + formato + " Duración: " + duracion;
		assertEquals(resultado,expected);
	}
}
