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
	
		if(numero/10==0) {
			System.out.println("resultadooo "+numero);
			return numero;
		}
		else {
			System.out.println(numero);
			return (numero/10)+DevolverSumaDigitos(numero/10);
		}
	}
	
	//Ejercicio7.
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
			System.out.println("Máximo: "+lista[0]);
		}
		else {
			if(lista[0]>lista[1]) {
				lista[1]=lista[0];
			}
			lista=borrarPrimeraPosicion(lista);
			MostrarMaximo(lista);
			
		}
	}
	
	//Ejercicio7. Otra forma:
	public int maximo(int []vector) {
		return maximo2(vector, 1);
	}
	
	public int maximo2(int[] vector, int pos) {
		if(pos==vector.length) {
			return vector[0];
		}
		else {
			if(vector[0]<vector[pos]) {
				vector[0]=vector[pos];
			}
			return maximo2(vector, pos+1);
		}
	}
	
	
//mal	
	public String[] invertirString(String [] str) {
		String [] str2=new String [str.length]; //nuevo string del mismo tamaño que str
		return invertirString2(str, 0, str2); //se le pasan los dos string además de la posición
		}
	public String[] invertirString2(String [] str, int pos, String [] str2) {
		if(pos>=str.length/2) { //la recursividad se detiene cuando se llega a la mitad de la palabra
			return str2;
		}
		else {
			str2[pos]=str[str.length-pos-1]; // se copia la última posición del String str en la primera de str2.
			str2[str.length-pos-1]=str[pos]; //Se copia la primera posición del String str en la primera de str2
			return invertirString2(str, pos+1, str2);
		}
	}

	//Ejercicio 9 sin recursividad:
	public int calcularBinario(int num) {
		 int exp=0;
	     int binario=0;
	        while(num!=0){
	               int res = num % 2;            
	                binario = (int) (binario + res);   
	                exp++;
	                num = num/2;
	        }
	        return binario;
	}
	
	//con recursividad
	public int decBin(int num) {
		 if (num < 2) {
	            System.out.print(num+"|");
	            return num;
	        } else {
	            decBin(num / 2);
	            System.out.print(num % 2);
	            return num % 2;
	        }
	    }
		
}

