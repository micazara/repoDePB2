package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Agremiado extends Efectivo{
	
	//ATRIBUTO DE CLASE
	private Gremio gremio;
	
	//CONSTRUCTOR

	public Agremiado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, ObraSocial obraSocial, Gremio gremio) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial);
		
		this.gremio=gremio;
	}

	protected Gremio getGremio() {
		return gremio;
	}

	protected void setGremio(Gremio gremio) {
		this.gremio = gremio;
	}

	


}
