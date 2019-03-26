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
}
