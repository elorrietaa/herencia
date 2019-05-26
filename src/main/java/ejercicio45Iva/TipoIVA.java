package ejercicio45Iva;

public class TipoIVA {
	//Atributos o propiedades
	private int idTipo;
	private String descripcion;
	private int porcentajeIVA;	
	
	private double masIVA;
	
		//Constructor:
		public TipoIVA ( int idTipo, String descripcion, int porcentajeIVA)
		{
			this.idTipo=idTipo;
			this.descripcion=descripcion;
			this.porcentajeIVA=porcentajeIVA;
		}

		//Métodos (get y set)
		public int getIdTipo() {
			return idTipo;
		}

		public void setIdTipo(int idTipo) {
			this.idTipo = idTipo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		public int getPorcentajeIVA() {
			return porcentajeIVA;
		}


		public void setPorcentajeIVA(int porcentajeIVA) {
			this.porcentajeIVA = porcentajeIVA;
		}

		public double getMasIVA() {
			return masIVA;
		}

		public void setMasIVA(double masIVA) {
			this.masIVA = masIVA;
		}
		
		
}
