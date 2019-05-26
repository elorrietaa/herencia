package examen2EvalAlba;

public class Alumno {
	
	//atributos
	private int cod_alumno;
	private String nombre;
	private double nota_trabajo=0;
	private double nota_practica=0;
	private double nota_examen=0;
	private double nota_final=0;
	
	//constructores
	public Alumno(int cod_alumno)
	{
		this.cod_alumno=cod_alumno;
	}
	
	public Alumno(int cod_alumno, String nombre)
	{
		this.cod_alumno=cod_alumno;
		this.nombre=nombre;
	}
	
	public Alumno(int cod_alumno, String nombre, double nota_trabajo, double nota_practica, double nota_examen)
	{
		this.cod_alumno=cod_alumno;
		this.nombre=nombre;
		this.nota_trabajo=nota_trabajo;
		this.nota_practica=nota_practica;
		this.nota_examen=nota_examen;
		
	}
	
	public Alumno(int cod_alumno, String nombre, double nota_trabajo, double nota_practica, double nota_examen, double nota_final)
	{
		this.cod_alumno=cod_alumno;
		this.nombre=nombre;
		this.nota_trabajo=nota_trabajo;
		this.nota_practica=nota_practica;
		this.nota_examen=nota_examen;
		this.nota_final=((this.nota_practica*0.3)+(this.nota_examen*0.6)+(this.nota_trabajo*0.1));
	}
	//get y set
	public int getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota_trabajo() {
		return nota_trabajo;
	}

	public void setNota_trabajo(double nota_trabajo) {
		this.nota_trabajo = nota_trabajo;
	}

	public double getNota_practica() {
		return nota_practica;
	}

	public void setNota_practica(double nota_practica) {
		this.nota_practica = nota_practica;
	}

	public double getNota_examen() {
		return nota_examen;
	}

	public void setNota_examen(double nota_examen) {
		this.nota_examen = nota_examen;
	}
	
	public double getNota_final() {
		return nota_final;
	}

	public void setNota_final(double nota_final) {
		this.nota_final = nota_final;
	}
	
	//metodos:

	public boolean aprobado(double nota_trabajo, double nota_practica, double nota_examen) {
		boolean todasAprobadas=false;
		
		if(nota_trabajo>=5 && nota_practica>=5 && nota_examen>=5)
		{
			todasAprobadas=true;
			System.out.println("Todas aprobadas");
		}
		else
		{
			todasAprobadas=false;
			System.out.println("Alguna suspendida");
		}
		
		
		return todasAprobadas;
	}

	public double notaFinal() {
		nota_final=((this.nota_practica*0.3)+(this.nota_examen*0.6)+(this.nota_trabajo*0.1));
		
		return nota_final;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [cod_alumno=").append(cod_alumno).append(", nombre=").append(nombre)
				.append(", nota_trabajo=").append(nota_trabajo).append(", nota_practica=").append(nota_practica)
				.append(", nota_examen=").append(nota_examen).append(", nota_final=").append(nota_final).append("]");
		return builder.toString();
	}
	

	
	
	
	
}
