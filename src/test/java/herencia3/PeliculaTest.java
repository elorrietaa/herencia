package herencia3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliculaTest {

	//atributos propios de Pelicula
	private String titulo= "Interestelar";
	private String autor = "Autor";
	private String formato = "desconocido";
	private float duracion = 120;
	private String actorPrincipal = "Carlos";
	private String actrizPrincipal = "Ana";
	private Pelicula peliculaPrueba = new Pelicula(titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);
	//constructor
	@Test
	public void testConstructorPelicula() {
		assertEquals(actorPrincipal, peliculaPrueba.getActorPrincipal());
		assertEquals(actrizPrincipal, peliculaPrueba.getActrizPrincipal());
	}
 
	@Test 
	public void testActorPrincipal() {
		peliculaPrueba.setActorPrincipal(actorPrincipal);
		assertEquals(actorPrincipal, peliculaPrueba.getActorPrincipal());
	}
	
	@Test
	public void testActrizPrincipal() {
		peliculaPrueba.setActrizPrincipal(actrizPrincipal);
		assertEquals(actrizPrincipal, peliculaPrueba.getActrizPrincipal());
	}
//DUDA: en el expected, poniendo super.toString() no me deja, poniendo todo conletra sí. Como hay que hacer?	
	@Test
	public void testToString() {
		String resultado = peliculaPrueba.toString();
		String expected = " Título: " + titulo + " Autor: " + autor + " Formato: " + formato + " Duración: " + duracion+ " Actor Principal: " + actorPrincipal + " Actriz Principal: " + actrizPrincipal;
		assertEquals(resultado,expected);
	}
}
