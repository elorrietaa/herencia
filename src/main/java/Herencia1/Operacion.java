package Herencia1;

import java.util.Scanner;

public class Operacion {
	
	//Atributos:
	Scanner reader = new Scanner(System.in);
		protected int valor1;
		protected int valor2;
		protected int resultado;
		
		//constructores
		public void Suma() {
			
		}
		
		//get y set
		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		public int getValor2() {
			return valor2;
		}

		public void setValor2(int valor2) {
			this.valor2 = valor2;
		}

		public int getResultado() {
			return resultado;
		}

		public void setResultado(int resultado) {
			this.resultado = resultado;
		}
		
	//métodos:
		
		public void cargarValor1() {
			System.out.println("Introduce valor1");
			valor1=reader.nextInt();
		}
		
		public void cargarValor2() {
			System.out.println("Introduce valor2");
			valor2=reader.nextInt();
		}
		
		public void mostrarResultado() {
			System.out.println(resultado);
		}
		
		public void operar() {
			
		}
		
		
}
