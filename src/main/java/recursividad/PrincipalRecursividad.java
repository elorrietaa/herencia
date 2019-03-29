package recursividad;

public class PrincipalRecursividad {

	public static void main(String[] args) {
		Recursividad1 recursividad1 = new Recursividad1();
		
		//Ejercicio0. Crear un programa recursivo que escriba el número factorial de un número n.
		System.out.println("EJERCICIO 0: FACTORIAL:");
		int resultado1= recursividad1.Factorial(3);
		System.out.println(resultado1);
		
		//Ejercicio1. Crear un programa recursivo que escriba los primeros 50 numeros naturales.
		System.out.println("EJERCICIO 1: Primeros 50 numeros naturales.");
		recursividad1.Primeros50Num(50);
		
		//Ejercicio3. Crear un programa que devuelva la suma de los primeros n numeros naturales
		System.out.println("EJERCICIO 2: suma de los primeros n numeros naturales.");
		int sumaNNumeros=recursividad1.SumaNNumeros(4);
		System.out.println(sumaNNumeros);
		
		//Ejercicio3. Crear un programa que devuelva la suma de los primeros n numeros naturales
		System.out.println("EJERCICIO 3: Serie de fibonacci de los primeros n elementos.");
		int resultadoFibonacci = recursividad1.Fibonacci(6);
		System.out.println(resultadoFibonacci);
		
		//Ejercicio4. Crear un programa que muestre por pantalla los elementos de un array de numeros enteros.
		System.out.println("EJERCICIO 4: array de numeros enteros.");
		int [] cadenaEnteros= {2,5,8,4,5,6};
		recursividad1.Cadena(cadenaEnteros);
		
		//Ejercicio5. Crea una funcion recursiva que devuelva el numero de digitos de un numero cualquiera. 
		System.out.println("EJERCICIO 5: devuelva el numero de digitos de un numero cualquiera.");
		int numero=4321;
		int numeroDigitos=0;
		numeroDigitos=recursividad1.DevolverNumDigitos(numero);
		System.out.println("Número de dígitos del número: "+numero+" es: "+ numeroDigitos);
		
//MAAAAAAAAAAl//Ejercicio6. Crea una funcion recursiva que devuelva la suma de los digitos de un numero cualquiera. 
		System.out.println("EJERCICIO 6: devuelva la suma de los digitos de un numero cualquiera.");
		int sumaDigitos=0;
		sumaDigitos=recursividad1.DevolverSumaDigitos(numero);
		System.out.println("Suma de dígitos del número: "+numero+" es: "+ sumaDigitos);
		
		//Ejercicio7. Crea una programa recursivo que muestre el maximo de un array de numeros enteros cualquiera.
		System.out.println("EJERCICIO 7: que muestre el maximo de un array de numeros enteros cualquiera.");
		int [] cadenaEnterosDos= {2,5,4,5,6,8};
		//recursividad1.MaximoDeLaCadena(cadenaEnterosDos);
	
		//correccion clase:
			recursividad1.MostrarMaximo(cadenaEnterosDos);
			
		//Ejercicio8. Crea una funcion recursiva que devuelva un string del reves
		String [] palabra= {"H", "O", "L", "A"};
		String [] palabraAlreves = new String [palabra.length];
		System.out.println("Ejercicio8. Crea una funcion recursiva que devuelva un string del reves");
		//palabraAlreves=recursividad1.reverse(String [] palabra);
		System.out.println(palabraAlreves);
		
		//Ejercicio9. Crea una funcion recursiva que devuelva el numero binario de un numero entero cualquiera
		int numeroBinario=0;
		System.out.println("Ejercicio9. Crea una funcion recursiva que devuelva el numero binario de un numero entero cualquiera");
		//numeroBinario=recursividad1.binario(8);
		System.out.println(numeroBinario);
		
		 
		
	}

}
