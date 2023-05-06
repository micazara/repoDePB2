package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Contratado extends Empleado{

	private LocalDate fCaducidad;

	public Contratado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, LocalDate fCaducidad) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento);
		this.fCaducidad = fCaducidad;
	}

	LocalDate getfCaducidad() {
		return fCaducidad;
	}

	void setfCaducidad(LocalDate fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	
	
	
	

}
