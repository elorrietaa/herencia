package pruebasClasePagoYVueltas;

import java.text.DecimalFormat;

public class PrincipalPruebasReto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DecimalFormat df = new DecimalFormat("0.00");
	DecimalFormat dfe = new DecimalFormat("0");
	int [] contadorProducto = {1,1,1,1,1,1,1,1};
	//int [] contadorCambio = {0,0,0,0,0,0,0,0};
	
	
	
	float [] precioConIva=CalcularPrecios.CalcularPrecioConIva();
	float precioTotal=CalcularPrecios.CalcularPrecioTotal(precioConIva, contadorProducto);
	System.out.println("precioTotal"+precioTotal);
	System.out.println(df.format(precioTotal));
	float precioIntroducidoAcumulado=20;
	System.out.println("precioIntroducidoAcumulado"+precioIntroducidoAcumulado);
	float falta=CalcularVueltas.CalcularFalta(precioTotal, precioIntroducidoAcumulado);
	System.out.println("falta: "+falta);
	
	float totalVueltas=CalcularVueltas.CalcularTotalVueltas(precioTotal, precioIntroducidoAcumulado);
	System.out.println("Total vueltas: "+totalVueltas);
	System.out.println("Total vueltas: "+df.format(totalVueltas));
	float numeroDinero []= {0,0,0,0,0,0,0,0,0,0,0,0,0};
	numeroDinero=CalcularVueltas.CalcularNumeroVueltas(totalVueltas);
	for(int i=0; i<numeroDinero.length;i++) {
		System.out.println("numero de "+Dinero1.mensajeBilletes[i]+": "+dfe.format(numeroDinero[i]));
	}
	
	}
	
	

}
