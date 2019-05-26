package ejercicio45Iva;
import java.util.Scanner;

public class MainEjercicio45 {

	public static void main(String[] args) {
		// Declaracion e inicializacion de variables
		LeerDatos leerDatos = new LeerDatos();
		Scanner reader = new Scanner(System.in);
		FuncionesEjercicio45 funciones = new FuncionesEjercicio45();
		
		TipoIVA [] arrayTiposIVA = null;
		Producto [] arrayProductos = null;
			
		double importeTotal = 0;
		
		//Inicio de programa
		arrayTiposIVA = funciones.CargarDatosTipoIVA(reader, leerDatos);
		arrayProductos = funciones.CargarDatosProducto(reader, leerDatos, arrayTiposIVA);
		funciones.CalcularPrecioFinalSinIVA(arrayTiposIVA, arrayProductos);
		funciones.CalcularIVA(arrayTiposIVA, arrayProductos);
		funciones.CalcularPrecioFinalConIVA(arrayTiposIVA, arrayProductos);
		importeTotal=funciones.CalcularImporteTotal(arrayTiposIVA, arrayProductos);
		
		funciones.MostrarTicket(arrayTiposIVA, arrayProductos, importeTotal);
		
		
		reader.close();

	}

	
}
