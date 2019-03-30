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
		
		//corrección clase con dos funciones y sin eliminar posiciones del vector
		int maximo=-1;
		maximo= recursividad1.maximo(cadenaEnterosDos);
		System.out.println("Máximo es: " + maximo);
		
		//Ejercicio8. Crea una funcion recursiva que devuelva un string del reves
		String [] str= {"H", "O", "L", "A"};
		String [] str2 = new String [str.length];
		System.out.println("Ejercicio8. Crea una funcion recursiva que devuelva un string del reves");
		str2=recursividad1.invertirString(str);
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}
		
//MAL	//Ejercicio9. Crea una funcion recursiva que devuelva el numero binario de un numero entero cualquiera
		System.out.println("Calcular binario sin recursividad:");
		int numBinario=recursividad1.calcularBinario(8);
		System.out.println(numBinario);
		int numeroBinario=0;
		System.out.println("Ejercicio9. Crea una funcion recursiva que devuelva el numero binario de un numero entero cualquiera");
		numeroBinario=recursividad1.decBin(8);
		System.out.println(numeroBinario);
		
		//Ejercicio10. Crea una funcion recursiva que determine si un numero es primoo no.
		
		//Ejercicio11. Crea un programa que muestre los numeros pares hasta 100 por pantalla.

		
	}

}
