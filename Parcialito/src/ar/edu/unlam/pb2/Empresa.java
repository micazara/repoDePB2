package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Iterator;

public class Empresa {

	private String nombre;
	private HashSet<Empleado> empleados;
	private HashSet<Credencial> credenciales;


	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new HashSet<Empleado>();
		this.credenciales= new HashSet <Credencial>();
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	void setEmpleados(HashSet<Empleado> empleados) {
		this.empleados = empleados;
		
	}

	public Integer getCantidadEmpleados() {
		return empleados.size();
	}

	public Boolean agregarEmpleado(Empleado emp) {
         
		return this.empleados.add(emp);
	}

	public Integer filtrarCantidadDeContratados() {
		Integer cantidad = 0;

		for (Empleado empleado : empleados) {
			if (empleado instanceof Contratado) {
				cantidad++;
			}
		}

		return cantidad;
	}

	public Integer filtrarCantidadDeEfectivos() {
		Integer cantidad = 0;

		for (Empleado empleado : empleados) {
			if (empleado instanceof Efectivo) {
				cantidad++;
			}
		}

		return cantidad;
	}

	public Integer filtrarCantidadAgremiados() {
		Integer cantidad = 0;

		for (Empleado empleado : empleados) {
			if (empleado instanceof Agremiado) {
				cantidad++;
			}
		}

		return cantidad;
	}

	public Boolean agregarCredencial(Credencial credencial) {
		 
		return this.credenciales.add(credencial);
		
	}
}
