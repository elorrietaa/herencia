package ejerHospiLaura;

public enum GrupoSangre {
	
	AN("A-"),
	AP("A+"),
	BN("B-"),
	BP("B+"),
	ABN("AB-"),
	ABP("AB+"),
	ON("0-"),
	OP("0+");
	
	private String nombre;

	private GrupoSangre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
