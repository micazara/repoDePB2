package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class CasosDePruebaPuerta {
	
	// CANTIDAD DE TESTS: 2

	@Test
	public void queSePuedaAbrirLaPuertaConCredencialCorrecta() {

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

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;

		Integer codigo;
		TipoDePuerta tipodepuerta;

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
		credencial = new Credencial(5, TipoCredencial.VISITANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		// Validacion
		// Probamos que con la credencial correcta se abra.
		assertTrue(zara.abrirPuerta(puertaDeEntrada, credencial));
		// Si la credencial intenta abrir una puerta que no puede, no se abre.
		assertFalse(zara.abrirPuerta(puertaDeposito, credencial));

	}

	@Test
	public void queSePuedanAgregarLosAccesos() {

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
		Boolean permiso;
		LocalDateTime horaEntrada;
		Integer CANTIDAD_ACCESOS_ESPERADOS = 2;

		Puerta puertaDeEntrada;
		Puerta puertaDeposito;
		Accesos primerAcceso;
		Accesos segundoAcceso;

		Integer codigo;
		TipoDePuerta tipodepuerta;

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
		credencial = new Credencial(5, TipoCredencial.VISITANTE);
		puertaDeEntrada = new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito = new Puerta(1256, TipoDePuerta.DEPOSITO);
		horaEntrada = LocalDateTime.now();

		primerAcceso = new Accesos(false, horaEntrada, puertaDeEntrada);
		segundoAcceso = new Accesos(false, horaEntrada, puertaDeposito);
		credencial.add(primerAcceso);
		credencial.add(segundoAcceso);

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		assertNotNull(primerAcceso);
		assertNotNull(segundoAcceso);
		assertEquals(CANTIDAD_ACCESOS_ESPERADOS, credencial.getCantidadAccesos());

	}

}
