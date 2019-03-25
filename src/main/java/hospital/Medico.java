package hospital;

public class Medico extends EmpleadoPlantilla {
	//atributos:
	protected String especialidad;
	protected String servicio;
	protected int numeroConsultorio;
	
	//constructor:
	public Medico(String dni, String nombre, String apellido, String fechaNac, String direccion, String ciudad,
			float salarioMensual, float porcentajeHoraExtra, String especialidad,String servicio, int numeroConsultorio ) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad, salarioMensual, porcentajeHoraExtra);
		this.especialidad=especialidad;
		this.servicio=servicio;
		this.numeroConsultorio=numeroConsultorio;
	}

	//get y set
	public String getEspecialidad() {
		return especialidad;
	}

	

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public int getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(int numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	//métodos:
	public void ordenarEspecialidadDes(Medico[] arrayMedicos) {
        for(int i=arrayMedicos.length; i>0;i--) {
            for(int j=0;j<i-1;j++) {
                if (arrayMedicos[j].getEspecialidad().compareTo(arrayMedicos[j+1].getEspecialidad())<0) {
                	Medico aux;
                    aux=arrayMedicos[j+1];
                    arrayMedicos[j+1]=arrayMedicos[j];
                    arrayMedicos[j]=aux;
                }
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("3)	Listar los datos de los médicos ordenados en forma descendente por la especialidad.:");
        for(int i=0;i<arrayMedicos.length; i++) {
        	System.out.println(arrayMedicos[i].getNombre()+" "+arrayMedicos[i].getEspecialidad()+" "+arrayMedicos[i].getNumeroConsultorio());
        }
        System.out.println("--------------------------------------------");
    }
	
}
