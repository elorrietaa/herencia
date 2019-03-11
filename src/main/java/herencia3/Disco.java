package herencia3;

public class Disco extends Multimedia{
	//atributos
	public String generos;
	
	//constructor
	public Disco(String titulo, String autor, String formato, float duracion, String generos) {
		super(titulo, autor, formato, duracion);
		this.generos = generos;
	}



	//get y set
	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}

	//metodos

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [generos=").append(generos).append(", toString()=").append(super.toString()).append("]").append(System.getProperty("line.separator"));
		return builder.toString();
	}
	

	
	

	
	
	
	
}
