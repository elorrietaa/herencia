package herencia3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliculaTest {
	private String titulo="Interestelar";
	private String autor="autor1";
	private String formato = "desconocido";
	private float duracion=10;
	private String actorPrincipal="Luis";
	private String actrizPrincipal="Ana";
	Pelicula pelicula = new Pelicula(titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);
	
	@Test
	public void testContructorPelicula() {
		Pelicula peliculaPrueba = new Pelicula(titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);
		assertEquals(titulo, peliculaPrueba.getTitulo());
		assertEquals(autor, peliculaPrueba.getAutor());
		assertEquals(formato, peliculaPrueba.getFormato());
		assertEquals(duracion, peliculaPrueba.getDuracion(), 0.2);	
	}
	
	@Test
	public void testTitulo() {
		pelicula.setTitulo(titulo);
		
	}
	
}
