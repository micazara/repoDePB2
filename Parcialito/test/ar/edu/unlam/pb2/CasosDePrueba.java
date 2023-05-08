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
		Credencial credencial;

		Contratado contratado;
		LocalDate fCaducidad;

		// Ejecucion
		fIngreso = LocalDate.of(2023, 05, 13);
		fNac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.VIGILANCIA);

		fCaducidad = LocalDate.of(2024, 03, 01);

		contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fIngreso, fNac, departamento, fCaducidad,
				credencial);

		// Validacion
		assertNotNull(contratado);

	}

	@Test
	public void queNoSePuedanCrearEmpleadosConLaMismaCredencial() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso;
		LocalDate fNac;
		Departamento departamento;
		Credencial credencial;

		Contratado contratado;
		LocalDate fCaducidad;

		// Datos de entrada dos
		String nombre2, apellido2;
		Long CUIL2;
		Long legajo2;
		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		Credencial credencial2;
		Contratado contratado2;
		LocalDate fCaducidad2;
		Empresa empresa;
		String nombreEmpresa = "X";

		// Ejecucion
		fIngreso = LocalDate.of(2023, 05, 13);
		fNac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.VIGILANCIA);
		fCaducidad = LocalDate.of(2024, 03, 01);
		fIngreso2 = LocalDate.of(2023, 01, 13);
		fNac2 = LocalDate.of(2003, 07, 22);
		departamento2 = Departamento.LOGISTICA;
		credencial2 = new Credencial(5, TipoCredencial.VIGILANCIA);
		fCaducidad2 = LocalDate.of(2024, 03, 02);
		contratado = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fIngreso, fNac, departamento, fCaducidad,
				credencial);
		contratado2 = new Contratado("Micaela", "Zara", 132165465l, 2313153l, fIngreso2, fNac2, departamento2,
				fCaducidad2, credencial2);

		empresa = new Empresa(nombreEmpresa);

		// Validacion
		assertTrue(empresa.agregarCredencial(credencial));
		assertFalse(empresa.agregarCredencial(credencial2));
		assertTrue(empresa.agregarEmpleado(contratado2));
		assertFalse(empresa.agregarEmpleado(contratado));

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
		Credencial credencial;

		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// Ejecucion
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial);

		// Validacion
		assertNotNull(efec);
		assertNotNull(obraSocial);
	}

	@Test
	public void queSePuedaCrearUnTipoAgremiadoDeEfectivo() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		// EL AGREMIADO PERTENECE A UN GREMIO
		Gremio gremio;
		Agremiado zara;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(15l, "mercantil", "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		// Validacion
		assertNotNull(zara);
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

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

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

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial);
		efec2 = new Efectivo("Cele", "Moscovich", 132165465l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial);

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

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.VIGILANCIA);

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial);
		andy = new Contratado("Andy", "Borgeat", 132165465l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial);

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

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.VIGILANCIA);

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		fCaducidad1 = LocalDate.of(2024, 03, 01);

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		fCaducidad2 = LocalDate.of(2024, 06, 06);

		mari = new Contratado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, fCaducidad1,
				credencial);
		andy = new Contratado("Andy", "Borgeat", 111111111l, 2313153l, fIngreso2, fNac2, departamento2, fCaducidad2,
				credencial);

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

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

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

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);

		// Validacion

		assertEquals(CANTIDAD_ESPERADA_EFECTIVOS, empresa.filtrarCantidadDeEfectivos());

	}

	@Test
	public void queNoSePuedanCrearDosEmpleadosAgremiadosConElMismoCUIL() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Departamento departamento1;

		Agremiado mari;
		LocalDate fCaducidad1;

		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;
		LocalDate fCaducidad2;
		Agremiado andy;
		Gremio uno;
		ObraSocial obraSocialprimera;

		Empresa empresa;
		String nombreEmpresa;
		Gremio dos;
		ObraSocial obraSocialSegunda;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// Ejecucion
		fIngreso1 = LocalDate.of(2023, 05, 13);
		fNac1 = LocalDate.of(2003, 07, 21);
		departamento1 = Departamento.CONTABILIDAD;
		uno = new Gremio(5l, "ventas", "RIP");
		obraSocialprimera = new ObraSocial(788l, "pami");

		fIngreso2 = LocalDate.of(2020, 01, 02);
		fNac2 = LocalDate.of(1999, 10, 13);
		departamento2 = Departamento.RECURSOS_HUMANOS;
		dos = new Gremio(5l, "pesqueros", "FISH");
		obraSocialSegunda = new ObraSocial(57l, "pami");

		mari = new Agremiado("Mari", "Lee", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocialprimera,
				uno, credencial);
		andy = new Agremiado("Andy", "Borgeat", 132165465l, 2313153l, fIngreso2, fNac2, departamento2,
				obraSocialSegunda, dos, credencial);

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		// Validacion
		assertTrue(empresa.agregarEmpleado(mari));
		assertFalse(empresa.agregarEmpleado(andy));

	}

	@Test
	public void queSePuedaFiltrarLaCantidadDeEfectivosQueSonAgremiados() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fIngreso1;
		LocalDate fNac1;
		Departamento departamento1;

		Efectivo efec1;
		Efectivo efec2;
		LocalDate fIngreso2;
		LocalDate fNac2;
		Departamento departamento2;

		Agremiado agreUno;
		Agremiado agreDos;

		LocalDate fIngreso3;
		LocalDate fNac3;
		LocalDate fIngreso4;
		LocalDate fNac4;
		Departamento departamento3;
		Departamento departamento4;

		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Empresa empresa;
		String nombreEmpresa;

		Integer CANTIDAD_ESPERADA_EFECTIVOS = 4;
		Integer CANTIDAD_ESPERADA_AGREMIADOS = 2;

		Credencial credencial;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

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

		// agreUno
		fIngreso3 = LocalDate.of(2023, 04, 11);
		fNac3 = LocalDate.of(2003, 07, 29);
		departamento3 = Departamento.CONTABILIDAD;
		Gremio gremioTheOne;

		// agreDos
		fIngreso4 = LocalDate.of(2023, 02, 11);
		fNac4 = LocalDate.of(2003, 07, 05);
		departamento4 = Departamento.VENTAS;
		Gremio gremioTheSecond;

		nombreEmpresa = "X";
		empresa = new Empresa(nombreEmpresa);

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremioTheOne = new Gremio(45l, "mercantil", "LOSBEST");
		gremioTheSecond = new Gremio(46l, "zapateros", "DUENDES");

		// agremiado 1

		efec1 = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fIngreso1, fNac1, departamento1, obraSocial,
				credencial);
		efec2 = new Efectivo("Cele", "Moscovich", 222222222l, 1653165l, fIngreso2, fNac2, departamento2, obraSocial,
				credencial);

		agreUno = new Agremiado("Baby", "Veira", 4568765413564789l, 87654l, fIngreso3, fNac3, departamento3, obraSocial,
				gremioTheOne, credencial);
		agreDos = new Agremiado("Camila", "Flores", 54687l, 146585l, fIngreso4, fNac4, departamento4, obraSocial,
				gremioTheSecond, credencial);

		empresa.agregarEmpleado(efec1);
		empresa.agregarEmpleado(efec2);
		empresa.agregarEmpleado(agreDos);
		empresa.agregarEmpleado(agreUno);

		// Validacion

		assertEquals(CANTIDAD_ESPERADA_EFECTIVOS, empresa.filtrarCantidadDeEfectivos());
		assertEquals(CANTIDAD_ESPERADA_AGREMIADOS, empresa.filtrarCantidadAgremiados());

	}

	@Test
	public void queUnEmpleadoPuedaAbrirUnaPuertaConLaCredencial() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Departamento departamento;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;
		Gremio gremio;
		Agremiado zara;
		Credencial credencial;

		// Ejecucion
		nombre = "Bella";
		apellido = "De La Rosa";
		legajo = 5l;
		CUIL = 45L;
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";
		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		gremio = new Gremio(15l, "mercantil", "BPr");
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.VENTAS;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		// Validacion
//		credencial.abrirPuerta();
	}

	@Test
	public void queSePuedaCrearUnaPuertaDeAlPatio() {
		Integer codigo;
		Puerta puerta;

		codigo = 6321;
		puerta = new Puerta(codigo);

		assertNotNull(puerta);
	}

	@Test
	public void queUnEfectivoPuedaAbrirLaPuerta() {

		// Datos de entrada
		String nombre, apellido;
		Long CUIL;
		Long legajo;
		LocalDate fingreso;
		LocalDate fnac;
		Empleado mica;
		Departamento departamento;
		Credencial credencial;

		Efectivo efec;
		ObraSocial obraSocial;
		Long codigoObraSocial;
		String nombreObraSocial;

		Integer codigo;
		Puerta puertaVisitante;
		Puerta puertaResidente;
		Puerta puertaVigilancia;

		// Ejecucion
		fingreso = LocalDate.of(2023, 05, 13);
		fnac = LocalDate.of(2003, 07, 21);
		departamento = Departamento.CONTABILIDAD;
		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
		codigoObraSocial = 165165l;
		nombreObraSocial = "Osde";

		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
				credencial);

		codigo = 6321;
		puertaVigilancia = new Puerta(codigo);

		efec.abrirPuerta(puertaVigilancia);

		// Validacion

	}
}
