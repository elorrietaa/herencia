package herencia3;

public class Pelicula extends Multimedia {
	//atributos propios de Pelicula // si crees que en el futuro puede ser protected podría ponerse private o protected
	private String actorPrincipal;
	private String actrizPrincipal;
	
	//constructor
	public Pelicula(String titulo, String autor, String formato, float duracion, String actorPrincipal, String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal; //se puede meter como un método ahí o en el mismo constructor.
		this.actrizPrincipal = actrizPrincipal;
		
		if(actorPrincipal==null && actrizPrincipal==null) {
			throw new IllegalArgumentException("Por favor, introduza al menos un actor/actriz principal");
		}
	}
	//método al menos un actor:
	 

	//get y set
	public String getActorPrincipal() {
		return actorPrincipal;
	}
	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}


	@Override
	public String toString() {// super.toString() sobreescribe el método toString de la clase padre: multimedia
		return super.toString() + "Actor principal: " + actorPrincipal + "Actriz principal: " + actrizPrincipal;
	}


	


	
	
	
}
