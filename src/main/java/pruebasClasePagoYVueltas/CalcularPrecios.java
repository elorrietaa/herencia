package pruebasClasePagoYVueltas;

public class CalcularPrecios {
	
	
	public static double totalIntroducidoAcumulado;


	/**
	 *COMPRA:CalcularPrecioConIva
	 *Se calcula el precio con IVA para cada producto
	 * @param precioSinIva [i] ; el array precioSinIva declarado e inicializado en la clase Dinero
	 * @param Iva ; la constante IVA declarada e inicializada en la clase Dinero
	 * @return 
	 * @return precioConIva [i]; devuelve el array con los precios con IVA
	 */
	
	public static float [] CalcularPrecioConIva()
	{
		//Declaración e inicialización de variables							
		float [] precioConIva= new float [8];
		
		//Calcular precios con IVA:
		
		for(int i=0; i<8;i++)
		{
		 precioConIva [i]= (Dinero1.precioSinIva[i]+(Dinero1.precioSinIva[i]*Dinero1.IVA));
		 System.out.println( precioConIva [0]);
		}
	
		return precioConIva;
	}
	
	
	/**
	 *COMPRA:CalcularPrecioTotal
	 *Se calcula el precioTotal de la compra de los productos seleccionados por el cliente con el IVA incluído
	 * @param contadorProductos 
	 * @param precioConIva
	 * @param precioAcumulado
	 * @param precioTotal
	 * @return precioTotal ; devuelve la variable precioTotal
	 */
	
	public static float CalcularPrecioTotal(float [] precioConIva, int [] contadorProductos )
	{
		//Declaración e inicialización de variables
		
		float precioAcumulado []= new float [8];
		float precioTotal=0;
	
		for(int i=0; i<8;i++)
		{
			precioAcumulado [i]=precioConIva[i]*contadorProductos[i];
			precioTotal=precioTotal+precioAcumulado[i];
		}
	
	return precioTotal;
	}
	
	
	
	
}
