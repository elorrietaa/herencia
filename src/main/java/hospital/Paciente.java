package hospital;

import java.util.Date;

public class Paciente extends Persona {
	//atributos:
	protected int numHistoria;
	protected char sexo;
	protected String grupoSanguineo;
	protected String [] listaMedicamentos;
	
	//constructor:
	public Paciente(String dni, String nombre, String apellido, Date fechaNac, String direccion, String ciudad) {
		super(dni, nombre, apellido, fechaNac, direccion, ciudad);
		this.numHistoria=numHistoria;
		this.sexo=sexo;
		this.grupoSanguineo=grupoSanguineo;
		this.listaMedicamentos=listaMedicamentos;
	}
	
	//get y set
	public int getNumHistoria() {
		return numHistoria;
	}

	public void setNumHistoria(int numHistoria) {
		this.numHistoria = numHistoria;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String[] getListaMedicamentos() {
		return listaMedicamentos;
	}

	public void setListaMedicamentos(String[] listaMedicamentos) {
		this.listaMedicamentos = listaMedicamentos;
	}
	

	
}
