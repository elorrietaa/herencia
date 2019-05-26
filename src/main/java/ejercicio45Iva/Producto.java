package ejercicio45Iva;

public class Producto {
	//Atributos o propiedades
	private int tipoProducto;
	private String nombre;
	private int cantidad;
	private double precioUnitario;
	private double precioFinalSinIVA;
	private double precioFinalConIVA;
	
	//Constructor:
	public Producto(int tipoProducto, String nombre, int cantidad, double precioUnitario)
	{
		this.tipoProducto=tipoProducto;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precioUnitario=precioUnitario;
	}

	//Métodos (get y set)
	
	public int getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioFinalSinIVA() {
		return precioFinalSinIVA;
	}

	public void setPrecioFinalSinIVA(double d) {
		this.precioFinalSinIVA = d;
	}

	public double getPrecioFinalConIVA() {
		return precioFinalConIVA;
	}

	public void setPrecioFinalConIVA(double d) {
		this.precioFinalConIVA = d;
	}

}
