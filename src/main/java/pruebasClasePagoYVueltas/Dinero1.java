package pruebasClasePagoYVueltas;


public class Dinero1 {

	//MÉTODO CLASE DINERO CON LAS VARIABLES Y ARRAYS RELACIONADAS CON DINERO GUARDADAS AHÍ:
	
	//Declaración e inicialización de arrays y variables:
		//Declaración e inicialización de los billetes y monedas que se utilizarán en el array DINERO
	final static float BilleteDoscientos = 200;
	final static float BilleteCien = 100;
	final static float BilleteCincuenta = 50;
	final static float BilleteVeinte = 20;
	final static float BilleteDiez = 10;
	final static float BilleteCinco = 5;
	final static float MonedasDos = 2;
	final static float MonedasUno = 1;
	final static float MonedasCincuenta = (float) 0.5;
	final static float MonedasVeinte = (float) 0.2;
	final static float MonedasDiez = (float) 0.1;
	final static float MonedasCinco = (float) 0.05;
	final static float MonedasDosCent = (float) 0.02;
	final static float MonedasUnCent = (float) 0.01;
	
	//Variables precioSinIva
	final static float precioSinIva1 = (float) 1.5;
	final static float precioSinIva2 = (float) 2.0;
	final static float precioSinIva3 = (float) 2.0;
	final static float precioSinIva4 = (float) 2.0;
	final static float precioSinIva5 = (float) 1.8;
	final static float precioSinIva6 = (float) 1.5;
	final static float precioSinIva7 = (float) 2.0;
	final static float precioSinIva8 = (float) 1.0;
	
	//Este array tiene los precios sin IVA de los productos (es una constante)
	public final static float [] precioSinIva= {precioSinIva1, precioSinIva2, precioSinIva3, precioSinIva4, precioSinIva5, precioSinIva6, precioSinIva7, precioSinIva8};	
	
	//Este array tiene los divisores que se utilizan en las cuentas de las vueltas (es una constante)
	public final static float[] divisor= {BilleteDoscientos, BilleteCien, BilleteCincuenta, BilleteVeinte, BilleteDiez, BilleteCinco, MonedasDos, MonedasUno, MonedasCincuenta, MonedasVeinte, MonedasDiez, MonedasCinco, MonedasDosCent, MonedasUnCent  };
	public final static String[] mensajeBilletes= {"Billetes de 200€","Billetes de 100€", "Billetes de 50€", "Billetes de 20€", "Billetes de 10€", "Billetes de 5€", "Monedas de 2€", "Monedas de 1€", "Monedas de 50 céntimos", "Monedas de 20 céntimos", "Monedas de 10 céntimos", "Monedas de 5 céntimos", "Monedas de 2 céntimos", "Monedas de 1 céntimo"};
	//Declaración de constante IVA
	
	public final static float IVA = (float) 0.21;
	
	
	//Declaración e inicialización de variables 
	
	 float [] precioConIva;
				
	//Variable contadorProductos
	int [] contadorProductos;
	float precio;
	float precioTotal;
	float precioIntroducidoAcumulado;
	



}
