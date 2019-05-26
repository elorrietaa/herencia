package examen2EvalAlba;
import java.util.Scanner;

public class Asignatura {
	// atributos
	private int cod_Asignatura;
	private String nombre;
	private int numero = 0;
	private Alumno[] alumnos = new Alumno[20];

	// constructores
	public Asignatura(int cod_Asignatura, String nombre) {
		this.cod_Asignatura = cod_Asignatura;
		this.nombre = nombre;
	}

	public int getCod_Asignatura() {
		return cod_Asignatura;
	}

	public void setCod_Asignatura(int cod_Asignatura) {
		this.cod_Asignatura = cod_Asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	// métodos:

	public boolean estaLleno() {
		boolean siEstaLleno = false;

		if (this.numero > 20) {
			siEstaLleno = true;
			System.out.println("La clase esta llena.");
		} else {
			siEstaLleno = false;
		}

		return siEstaLleno;
	}

	public void anadirAlumno(Alumno a) {
		// se comprueba que se puede añadir un nuevo alumno
		if (!estaLleno()) {

			// se mete el alumno a en la posición
			alumnos[numero] = a;

			// aumentamos el índice a 1
			numero = numero + 1;
		} else {
			System.out.println("La asignatura está llena.");
		}
	}

	public int buscarAlumno(int codigo) {
		int posAlumno = -1;

		for (int i = 0; i < numero; i++) {
			if (alumnos[i].getCod_alumno() == codigo) {
				System.out.println("Alumno encontrado. El alumno es:" + alumnos[i].getNombre());
				posAlumno = i;
			}
		}
		return posAlumno;
	}

	public void ordenar() {
		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (alumnos[j].getNota_final() < alumnos[j + 1].getNota_final()) {
					Alumno aux;
					aux = alumnos[j + 1];
					alumnos[j + 1] = alumnos[j];
					alumnos[j] = aux;
				}
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("La LISTA DE ALUMNOS ORDENADA POR NOTAFINAL EN DESCENDENTE ES:");
		for (int i = 0; i < numero; i++) {
			System.out.println(
					alumnos[i].getNombre() + " - " + alumnos[i].getNota_examen() + " - " + alumnos[i].getNota_trabajo()
							+ " - " + alumnos[i].getNota_practica() + "-->" + alumnos[i].getNota_final());
		}
		System.out.println("--------------------------------------------");
	}

	public void borrar(int posicion) {
		// para quitar la posición
		// se declara un array de alumnos de una posición menos
		
		// IMPORTANTE: se actualiza el ínidice del array, si se borra una posición 8un alumno) el array será mas corto
		numero= numero-1;
		
		for (int j = posicion; j < numero; j++) {
			
			Alumno aux;
			aux = alumnos[j + 1];
			alumnos[j + 1] = alumnos[j];
			alumnos[j] = aux;
             
			System.out.println("Eliminada la posicion:" + posicion);
		}
	}

	public void listarAlumnos(Alumno[] alumnos) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < numero; i++) {
			System.out.println(
					alumnos[i].getNombre() + " - " + alumnos[i].getNota_examen() + " - " + alumnos[i].getNota_trabajo()
							+ " - " + alumnos[i].getNota_practica() + "-->" + alumnos[i].getNota_final());
		}
		System.out.println("--------------------------------------------");
	}

}
