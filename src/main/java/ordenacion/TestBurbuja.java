package ordenacion;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestBurbuja {

	int[] desOrdenado = {7,3,9,5,8,2};
	int[] arrayEsperado = {2,3,5,7,8,9};
	@Test
	public final void testBubble() {
		int[] desOrdenado = {7,3,9,5,8,6};
		int[] arrayEsperado = {3,5,6,7,8,9};
		assertArrayEquals(Burbuja.bubble(desOrdenado),arrayEsperado);
	}
	


}
