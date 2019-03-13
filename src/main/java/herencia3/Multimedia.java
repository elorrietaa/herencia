package herencia3;

public class Multimedia {
	//atributos
	protected String titulo;
	protected String autor;
	protected String formato = "desconocido";
	protected float duracion;
	
	//constructor
	public Multimedia(String titulo, String autor, String formato, float duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	//get y set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	//métodos
	public boolean equals(Multimedia multimedia1) {
		boolean sonIguales=false;
		if(multimedia1.getTitulo().contentEquals(multimedia1.getAutor())){
			sonIguales=true;
		}
		return sonIguales;
	}

	@Override
	public String toString() { //this. nos referimos a la instancia que sale de esa clase. 
		return " Titulo: " + this.titulo + " Autor: " + this.autor + " Formato: " + this.formato + " Duracion: " + this.duracion;
	}
	
	
	
}
