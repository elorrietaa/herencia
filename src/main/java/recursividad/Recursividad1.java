package recursividad;

public class Recursividad1 {
	public int Factorial(int x) {
		if(x==1) { //cuando x==1, devuelve un 1. 
			return 1; 
		}
		else { //en cada vuelta se llama a sí mismo el método. 
			
			x=x*Factorial(x-1);
		}
		return x;
	}
	
	public void Primeros50Num(int x) {
		if(x==1) { //cuando x==1, devuelve un 1. 
			System.out.println(x);
		}
		else { //en cada vuelta se llama a sí mismo el método. 
			System.out.println(x);
			Primeros50Num(x-1);
		}
		
	}
	
	public int SumaNNumeros(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n= n+SumaNNumeros(n-1);
		}
	}
	
	public int Fibonacci(int n) {
		if(n<2) {
			return n; 
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	public int [] borrarPrimeraPosicion(int[] numeros) {
		int [] numerosNuevo = new int [numeros.length-1];
		for(int i=0; i<numeros.length-1; i++) {
			numerosNuevo [i] = numeros[i+1];
		}
		/*	
    	System.out.println("El array numerosNuevo después de eliminar una posición se queda:");
    	for(int i=0;i<numerosNuevo.length;i++) {
    		System.out.println(numerosNuevo[i]);
    	}
    	*/
		return numerosNuevo;
	}
	public void Cadena(int[] numeros) {
		int max=numeros.length;
		if(numeros.length==1) {
			System.out.println(numeros[0]);
		}
		else {
			System.out.println(numeros[0]);
			numeros=borrarPrimeraPosicion(numeros);
			Cadena(numeros);
		}
	}
	
	public int DevolverNumDigitos(int numero) {
		if(numero/10<1) {
			return 1;
		}
		else {
			System.out.println(numero);
			return 1+DevolverNumDigitos(numero/10);
		}
	}
//maaaaaaaaaaaaaaaal	
	public int DevolverSumaDigitos(int numero) {
		if((numero%10)*10<1) {
			System.out.println("resultadooo "+numero);
			return numero;
		}
		else {
			System.out.println(numero);
			return numero+DevolverSumaDigitos((numero%10)*10);
		}
	}
	
/*	MAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAL
 * public void MaximoDeLaCadena(int[] numeros) {
		int maxLongitud=numeros.length;
		if(numeros.length==1) {
			System.out.println(numeros[1]+"es mayor");
		}
		else {
			if(numeros[0]>numeros[1]) {
				numeros[1]=numeros[0];
				numeros=borrarPrimeraPosicion(numeros);
				System.out.println(numeros[1]+"es mayor");
			}
			else {
				numeros=borrarPrimeraPosicion(numeros);
				MaximoDeLaCadena(numeros);
				System.out.println(numeros[1]+"es mayor");
			}
			
			
		}
	}
*/	
	public void MostrarMaximo(int[] lista) {
		
		if(lista.length==1) {
			System.out.println(lista[0]+"es mayor");
		}
		else {
			if(lista[0]>lista[1]) {
				lista[1]=lista[0];
			}
			lista=borrarPrimeraPosicion(lista);
			MostrarMaximo(lista);
			
		}
	}
//mal	
	public String reverse(String palabra) {
		int palabramedida=palabra.length();
		 if (palabra.length() == 1)
		   return palabra;
		 else 
		   return reverse(palabra.substring(1))+palabra;
		}

	
}
