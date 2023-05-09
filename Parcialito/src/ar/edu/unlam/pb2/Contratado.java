package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contratado extends Empleado {

	private LocalDate fCaducidad;

	public Contratado(String nombre, String apellido, Long CUIL, Long legajo, LocalDate fingreso, LocalDate fnac,
			Departamento departamento, LocalDate fCaducidad, Credencial credencial) {
		super(nombre, apellido, CUIL, legajo, fingreso, fnac, departamento, credencial);
		this.fCaducidad = fCaducidad;
	}

	LocalDate getfCaducidad() {
		return fCaducidad;
	}

	void setfCaducidad(LocalDate fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	@Override
	public boolean abrirPuerta(Puerta puerta, Credencial credencial) {
		Boolean seAbrio = false;
		LocalDateTime fechaIngreso= LocalDateTime.now();
		if (puerta.meAbroConCredencial(credencial))
			credencial.guardarAcceso(seAbrio, puerta, fechaIngreso);
			seAbrio = true;
		

		return seAbrio;
	}

	

	

}
