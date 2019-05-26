package examen2EvalAlba;
import java.util.Scanner;

public class MainExamenAlba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionesExamenAlba funciones = new FuncionesExamenAlba();
		LeerDatos leerDatos = new LeerDatos();
		Scanner reader = new Scanner(System.in);
		
		 //declaración e inicialización de variables:
		int cod_Asignatura;
		String nombre;
		
		cod_Asignatura = leerDatos.RecogerOpcionInt(reader, 0, 21, "Introduzca código asignatura");
		nombre=leerDatos.IntroducirTexto(reader, "Introduzca el nombre de la asignatura:");
		
		//Se crea la asignatura
		System.out.println("***1.- CREAR UNA NUEVA ASIGNATURA:");
		Asignatura asignatura1 = new Asignatura(cod_Asignatura, nombre);
		
		System.out.println( "La asignatura es: Código asignatura: " + asignatura1.getCod_Asignatura() + " , Nombre asignatura: " + asignatura1.getNombre());
		
		//se crean los alumnos
		System.out.println("***2.- MATRICULAR 6 ALUMNOS EN LA NUEVA ASIGNATURA:");
		Alumno alumno1 = new Alumno(1);
		Alumno alumno2 = new Alumno(2);
		Alumno alumno3 = new Alumno(4, "Alba");
		Alumno alumno4 = new Alumno(3, "Juan");
		Alumno alumno5 = new Alumno(5, "Ana", 10, 5, 3);
		Alumno alumno6 = new Alumno(6, "Carlos", 10, 10, 8);
		Alumno alumno7 = new Alumno(7, "Lara", 10, 10, 5);
		
		//se introducen los alumnos en la asignatura1
		//En el método anadirAlumno se comprueba si la asignatura está llena y se actualiza el número de alumnos de la asignatura cada vez que se añade un número
		asignatura1.anadirAlumno(alumno1);
		asignatura1.anadirAlumno(alumno2);
		asignatura1.anadirAlumno(alumno3);
		asignatura1.anadirAlumno(alumno4);
		asignatura1.anadirAlumno(alumno5);
		asignatura1.anadirAlumno(alumno6);
		asignatura1.anadirAlumno(alumno7);
		
		System.out.println("***mostrar lista alumnos de la asignatura");
		asignatura1.listarAlumnos(asignatura1.getAlumnos());
		
		System.out.println("***3. CALCULAR NOTA FINAL Y ORDENAR EL ARRAY ALUMNOS DE MAYOR A MENOR");
		
		double nf=alumno1.notaFinal();
		alumno1.setNota_final(nf);
		double nf5=alumno5.notaFinal();
		alumno5.setNota_final(nf5);
		System.out.println("--->la nota final 5 es: " + nf5);
		
		double nf6=alumno6.notaFinal();
		alumno6.setNota_final(nf6);
		System.out.println("--->la nota final 6 es: " + nf6);
		
		double nf7=alumno7.notaFinal();
		alumno7.setNota_final(nf7);
		System.out.println("--->la nota final 7 es: " + nf7);
		
		
		asignatura1.ordenar();
		
		System.out.println("***4. CALCULAR NUMERO DE ALUMNOS Y SU LISTA:");
		System.out.println("4.1. Número de alumnos:" + asignatura1.getNumero());
		System.out.println("4.2. Lista:"); 
		//la sigue mostrando ordenada, porque he ordenado el array alumnos.
		asignatura1.listarAlumnos(asignatura1.getAlumnos()); 
		
		System.out.println("***5. BORRAR UN ALUMNO:");
		//Se le pasa el codigo del alumno (6) y devuelve la posición en la que se encuentra el alumno en el array alumnos de la asignatura1.
		int codPosAlumno = asignatura1.buscarAlumno(6);
		System.out.println("codPosAlumno"+codPosAlumno);
		
		//borra la posición que le pasamos por parámetro del array alumnos de la asignatura1.
		asignatura1.borrar(codPosAlumno);
		
		System.out.println("***6. MOSTRAR LISTA DE ALUMNOS:");
		asignatura1.listarAlumnos(asignatura1.getAlumnos()); 
		
		System.out.println("***5. BORRAR UN ALUMNO:");
		int codPosAlumno2 = asignatura1.buscarAlumno(7);
		System.out.println("codPosAlumno"+codPosAlumno2);
		asignatura1.borrar(codPosAlumno2);
		
		System.out.println("***6. MOSTRAR LISTA DE ALUMNOS:");
		asignatura1.listarAlumnos(asignatura1.getAlumnos()); 
	}

}
