package ejerHospiLaura;
import java.util.Date;

public class Paciente extends Persona {
	
	private int numHistoria;
	private char sexo;
	private GrupoSangre grupoSanguineo;
	private String[] medicamentosAlergias;
	
	public Paciente(String dni, String nombre, String apellido, Date fechaNacimiento, String direccion, String ciudad,
			int numHistoria, char sexo, GrupoSangre grupoSanguineo, String[] medicamentosAlergias) {
		
		super(dni, nombre, apellido, fechaNacimiento, direccion, ciudad);
		this.numHistoria = numHistoria;
		this.sexo = sexo;
		this.grupoSanguineo = grupoSanguineo;
		this.medicamentosAlergias = medicamentosAlergias;
	}

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
		// validar sexo
		this.sexo = sexo;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo.getNombre();
	}

	public void setGrupoSanguineo(GrupoSangre grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String[] getMedicamentosAlergias() {
		return medicamentosAlergias;
	}

	public void setMedicamentosAlergias(String[] medicamentosAlergias) {
		this.medicamentosAlergias = medicamentosAlergias;
	}

}
