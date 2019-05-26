package ejercicio45Iva;
import java.util.Scanner;

public class FuncionesEjercicio45 {


public TipoIVA[] CargarDatosTipoIVA(Scanner reader, LeerDatos leerDatos) {
		
	//Declaracion e inicialización de variables
	int contador = 1;
	int idTipo=0;
	String descripcion;
	int porcentajeIVA;
	boolean continuar=true;
	TipoIVA [] arrayAuxiliar=null;
	TipoIVA [] arrayTiposIVA = null;
	//Inicio de programa
	System.out.println("Tipos de IVA:");
	while(continuar)
	{
		//añadir una posicion al array tipo de IVA
		//COPIAR arrayTiposIVA:
		arrayAuxiliar = arrayTiposIVA;
		arrayTiposIVA = new TipoIVA[contador];
		if(arrayAuxiliar != null)
		{
			System.arraycopy(arrayAuxiliar, 0, arrayTiposIVA, 0, arrayAuxiliar.length);
		}
		
		idTipo=idTipo+1;
		
		descripcion = leerDatos.IntroducirTexto(reader,"Introduce tipo de producto "+ idTipo +" : ");
		porcentajeIVA = leerDatos.RecogerOpcionInt(reader,0,25,"Introduce el porcentaje de IVA Tipo "+ idTipo +" ("+descripcion+"):");
		continuar = leerDatos.IntroducirRespuesta(reader, "¿Desea introducir más tipos de producto (S/N) ? ");
	
		//Dar valores al array:(dentro del while)
		TipoIVA objetoTipoIVA = new TipoIVA(idTipo, descripcion, porcentajeIVA);
		arrayTiposIVA[contador-1] = objetoTipoIVA; //inicializo el arrayTipoIVA en [idTipo-1]
		contador=contador+1;
		
	}
	return arrayTiposIVA;		
}
	
public Producto[] CargarDatosProducto(Scanner reader, LeerDatos leerDatos, TipoIVA [] arrayTiposIVA) {
		
		//Declaracion e inicialización de variables
		int contador=1;
		int contadorProducto=0;
		String nombre;
		int cantidad;
		double precioUnitario;
		int tipoProducto;
	
		boolean continuar=true;
		//Declaro el array productos del obtejo Producto y lo inicializo a null.
		Producto [] arrayAuxiliar=null;
		Producto [] arrayProductos = null;
		
		//Inicio de programa
		System.out.println("Productos:");
		
		//creo el array: //se prodria inicializar en un array con +1

		while(continuar)
		{
//Aquí esta bien mandar el getIdTipo con un get?? y poner un for??, no, se utilizan las variables locales contador y nombre
			arrayAuxiliar = arrayProductos;
			arrayProductos = new Producto[contador];
			if(arrayAuxiliar!=null)
			{
				System.arraycopy(arrayAuxiliar, 0, arrayProductos, 0, arrayAuxiliar.length);
			}
			contadorProducto=contadorProducto+1;
			tipoProducto = leerDatos.IntroducirYValidarTipoDeProducto(reader, arrayTiposIVA, arrayProductos);
			nombre=leerDatos.IntroducirTexto(reader,"Introduce nombre del producto: "+ contadorProducto +" : ");
			cantidad=leerDatos.RecogerOpcionInt(reader,0,999999,"¿Qué cantidad de "+ nombre +" has comprado? :");
			precioUnitario=leerDatos.RecogerOpcionDouble(reader,0,300,"¿Cual es el precio unitario (sin IVA) de "+ nombre +"? :");
				
			continuar = leerDatos.IntroducirRespuesta(reader, "¿Desea continuar introduciendo productos (S/N) ?  ");
			
			//Dar valores al array:(dentro del while)
			Producto objetoProducto = new Producto(tipoProducto, nombre, cantidad,precioUnitario );

			arrayProductos[contador-1] = objetoProducto;
			contador=contador+1;
		}	
		return arrayProductos;
	}

	

	

	private TipoIVA BuscarTipoIVA(Producto producto, TipoIVA[] arrayTiposIVA) {
		// TODO Auto-generated method stub
		
		TipoIVA tipoElegido =  null;
		for(int x= 0;x<arrayTiposIVA.length;x++)
		{
		   if(arrayTiposIVA[x].getIdTipo() ==producto.getTipoProducto())
			   tipoElegido = arrayTiposIVA[x];
		}
		return tipoElegido;
	}
	
	public void CalcularPrecioFinalSinIVA(TipoIVA [] arrayTiposIVA, Producto [] arrayProductos)
	{
		//Declaración e inicialización de variables
		
		//Inicio programa
		for(int i = 0;i<arrayProductos.length;i++)
		{
			arrayProductos[i].setPrecioFinalSinIVA( arrayProductos[i].getCantidad() * arrayProductos[i].getPrecioUnitario());
		}
	}
	
	public void CalcularIVA(TipoIVA [] arrayTiposIVA, Producto [] arrayProductos)
	{
		//Declaración e inicialización de variables
		
		//Inicio programa
		for(int i = 0;i<arrayProductos.length;i++)
		{
			TipoIVA tipoElegido = BuscarTipoIVA(arrayProductos[i],arrayTiposIVA);
			
			
			
			int porcentaje = tipoElegido.getPorcentajeIVA();
		
			arrayTiposIVA[i].setMasIVA ((arrayProductos[i].getPrecioFinalSinIVA() * porcentaje)/100);
		}
			
	}
	
	

	public void CalcularPrecioFinalConIVA(TipoIVA [] arrayTiposIVA, Producto [] arrayProductos)
	{
		//Declaración e inicialización de variables
	
		//Inicio programa
		for(int i = 0;i<arrayProductos.length;i++)
		{
			
			arrayProductos[i].setPrecioFinalConIVA(arrayProductos[i].getCantidad() * arrayProductos[i].getPrecioUnitario() 
					+ arrayTiposIVA[i].getMasIVA()) ;
		}
	
	}
	
//es mejor inicializar el for en productos.length (pasando el objeto por parámetro o con contadorProductos ????
	public double CalcularImporteTotal(TipoIVA [] arrayTiposIVA, Producto [] arrayProductos)
	{
		//Declaración e inicialización de variables
		double importeTotal = 0;
		
		//Inicio programa
		for(int i = 0;i<arrayProductos.length;i++)
		{
			importeTotal = importeTotal + arrayProductos[i].getPrecioFinalConIVA();
		}
	
		
		return importeTotal;
	}
	
	public void MostrarTicket(TipoIVA [] arrayTiposIVA, Producto [] arrayProductos, double importeTotal)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("PRODUCTO  \t \t	CANTIDAD \t PRECIO (sin IVA)            	PRECIO FINAL");
		System.out.println("----------------           	--------------- 	----------------------                	--------------------");
		for(int i = 0;i<arrayProductos.length;i++)
		{
			System.out.println(arrayProductos[i].getNombre()+"    \t   \t  	"+arrayProductos[i].getCantidad()+"            	"+ +arrayProductos[i].getPrecioUnitario()+"            	"+ arrayProductos[i].getPrecioFinalConIVA() );
		}
		System.out.println("Importe total                                                                                       "+ importeTotal);
		System.out.println("");
		System.out.println("------------------------------IVA-------------------------");
		System.out.println("TIPO                      	                     	%               	IVA");
		System.out.println("------                        	                     	--                	-----");
		for(int i = 0;i<arrayProductos.length;i++)
		{
			System.out.println(arrayTiposIVA[i].getDescripcion()+"   \t \t \t \t \t   	"+arrayTiposIVA[i].getPorcentajeIVA()+"            	"+ arrayTiposIVA[i].getMasIVA() );
		}		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}

	
}
