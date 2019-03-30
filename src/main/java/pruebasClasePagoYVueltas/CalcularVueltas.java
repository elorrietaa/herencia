package pruebasClasePagoYVueltas;

import java.text.DecimalFormat;

public class CalcularVueltas {

	public static double totalIntroducidoAcumulado;
	public static double falta;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
 
	/**
	 *CalcularPrecioIntroducidoAcumulado
	 *
	 * @param precioTotal
	 * @param precioIntroducido 
	 * @param precioIntroducidoAcumulado
	 * @param falta
	 * @return precioIntroducidoAcumulado devuelve el precio introducido acumulado
	 */
	
	
		public static float CalcularPrecioIntroducidoAcumulado(float precioTotal, int[] contadorCambio)
		{
			//Calcular precio introducido Acumulado
			//Inicialización de variables
			float precioIntroducidoAcumulado=0;
			float totalIntroducido = 0;
			
			
			//calcular totalIntroducidoAcumulado
			for(int i=0; i<14;i++)
			{
			totalIntroducido=  ( (Dinero1.divisor[i])*(contadorCambio[i]));
			precioIntroducidoAcumulado = precioIntroducidoAcumulado+totalIntroducido;	
			}
		return precioIntroducidoAcumulado;
		}
		
		
		public static float CalcularFalta (float precioTotal, float precioIntroducidoAcumulado)
		{
			//Declaración e inicialización de variables
			float falta=0;
			
			//Inicio programa
			falta=(float) (precioTotal-precioIntroducidoAcumulado);
			
			return falta;
		}



		/**
		 *CalcularVueltas
		 *Se calculan las vueltas o el cambio que recibirá el cliente por su compra:
		 * @param precioTotal
		 * @param precioIntroducidoAcumulado
		 * @param divisor 
		 * @param restoDinero
		 * @param totalVueltas
		 * @param numeroDinero
		 * * @return numeroDinero devuelve el numeroDinero que son el menor número de billetes
		 * @return 
		 * @return 
		 * 
		 */
		public static float CalcularTotalVueltas(float precioTotal, float precioIntroducidoAcumulado) {
			float totalVueltas=precioIntroducidoAcumulado-precioTotal;
			return totalVueltas;
		}
//MAL VUELTAS			
		public static float[] CalcularNumeroVueltas(float totalVueltas)

		{
			//Declaración e inicialización de arrays y variables:
			float numeroDinero [] = new float [13];
			float restoDinero [] = new float [13];
			
			//calcularDinero
			numeroDinero[0]= (totalVueltas/Dinero1.divisor[0]);
			restoDinero[0]=totalVueltas%Dinero1.divisor[0];
			
			for(int i=1; i<numeroDinero.length;i++)
			{
				
				numeroDinero[i]= (restoDinero[i-1]/Dinero1.divisor[i]);
				restoDinero[i]=restoDinero[i-1]%Dinero1.divisor[i];
				System.out.println("prueba"+numeroDinero[0]);
			}
			
		return numeroDinero;
		}
		
		

		
}

