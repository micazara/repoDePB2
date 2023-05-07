package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class CasosDePrueba {

	@Test
	public void queSePuedaCrearUnaEmpresa() {
		// Datos de entrada
		String nombre;
		Empresa empresa;

		// Ejecucion
		nombre = "X";
		empresa = new Empresa(nombre);

		// Validacion
		assertNotNull(empresa);
		
		System.out.println("Probandoooooo");
	}

	@Test
	public void queSePuedaCrearUnTipoContratadoDeEmpleado() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso;
		LocalDate fNac;
		Empleado mica;
		Departamento departamento;

		Contratado contratado;
		LocalDate fCaducidad;

		// Ejecucion
		fIngreso = LocalDate.of(2023, 05, 13);
		fNac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;

		fCaducidad = LocalDate.of(2024, 03, 01);

		contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fIngreso, fNac, departamento, fCaducidad);

		// Validacion
		assertNotNull(contratado);

	}

	@Test
	public void queSePuedaCrearUnTipoEfectivoDeEmpleado() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;

		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// Ejecucion
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial);

		// Validacion
		assertNotNull(efec);
		assertNotNull(obraSocial);
	}

	@Test
	public void queNoSePuedanCrearDosEmpleadosEfectivosConElMismoCUIL() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Efectivo efec1;
		Efectivo efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;

		Empresa empresa;
		String nombreEmpresa;

		// Ejecucion

		// efec 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// efec2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial);
		efec2 = new Efectivo("Cele", "Moscovich", 132165465l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial);

		// Validacion
		assertTrue(empresa.agregarEmpleado(efec1));
		assertFalse(empresa.agregarEmpleado(efec2));

	}

	@Test
	public void queNoSePuedanCrearDosEmpleadosContratadosConElMismoCUIL() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Contratado mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Contratado andy;

		Empresa empresa;
		String nombreEmpresa;

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1);
		andy = new Contratado("Andy", "Borgeat", 132165465l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// Validacion
		assertTrue(empresa.agregarEmpleado(mari));
		assertFalse(empresa.agregarEmpleado(andy));

	}

	@Test
	public void queSePuedaFiltrarLaCantidadDeContratados() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Contratado mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Contratado andy;

		Empresa empresa;
		String nombreEmpresa;

		Integer CANTIDAD_ESPERADA_CONTRATADOS = 2;

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1);
		andy = new Contratado("Andy", "Borgeat", 111111111l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		empresa.agregarEmpleado(mari);
		empresa.agregarEmpleado(andy);

		// Validacion
		assertEquals(CANTIDAD_ESPERADA_CONTRATADOS, empresa.filtrarCantidadDeContratados());

	}

	@Test
	public void queSePuedaFiltrarLaCantidadDeEfectivos() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Empleado mica;
		Departamento departamento1;

		Efectivo efec1;
		Efectivo efec2;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;

		Empresa empresa;
		String nombreEmpresa;

		Integer CANTIDAD_ESPERADA_EFECTIVOS = 2;

		// Ejecucion

		// efec 1
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		// efec2
		fIngreso2 = LocalDate.of(2022, 03, 15);
		fNac2 = LocalDate.of(2004, 06, 15);
		departamento2 = Departamento.RECURSOS_HUMANOS;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);

		// Validacion

		assertEquals(CANTIDAD_ESPERADA_EFECTIVOS, empresa.filtrarCantidadDeEfectivos());

	}
}
