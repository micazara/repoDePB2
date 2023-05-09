package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class CasosDePruebaPrueba {

	

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
		puertaDeEntrada= new Puerta(1234, TipoDePuerta.ENTRADA);
		puertaDeposito= new Puerta(1256, TipoDePuerta.DEPOSITO);
		

		// EL AGREMIADO
		zara = new Agremiado(nombreObraSocial, apellido, CUIL, legajo, fingreso, fnac, departamento, obraSocial, gremio,
				credencial);

		// Validacion
		// Probamos que con la credencial correcta se abra.
		assertTrue(zara.abrirPuerta(puertaDeEntrada, credencial));
		//Si la credencial intenta abrir una puerta que no puede, no se abre.
		assertFalse(zara.abrirPuerta(puertaDeposito, credencial));
		
	}
}

	//@Test
//	public void queSePuedaCrearUnaPuertaDeAlPatio() {
//		Integer codigo;
//		Puerta puerta;
//
//		codigo = 6321;
//	//	puerta = new Puerta(codigo);
//
//		assertNotNull(puerta);
//	}
//
//	@Test
//	public void queUnEfectivoPuedaAbrirLaPuerta() {
//
//		// Datos de entrada
//		String nombre, apellido;
//		Long CUIL;
//		Long legajo;
//		LocalDate fingreso;
//		LocalDate fnac;
//		Empleado mica;
//		Departamento departamento;
//		Credencial credencial;
//
//		Efectivo efec;
//		ObraSocial obraSocial;
//		Long codigoObraSocial;
//		String nombreObraSocial;
//
//		Integer codigo;
//		Puerta puertaVisitante;
//		Puerta puertaResidente;
//		Puerta puertaVigilancia;
//
//		// Ejecucion
//		fingreso = LocalDate.of(2023, 05, 13);
//		fnac = LocalDate.of(2003, 07, 21);
//		departamento = Departamento.CONTABILIDAD;
//		credencial = new Credencial(5, TipoCredencial.ALLACCESS);
//		codigoObraSocial = 165165l;
//		nombreObraSocial = "Osde";
//
//		obraSocial = new ObraSocial(codigoObraSocial, nombreObraSocial);
//		efec = new Efectivo("Micaela", "Zara", 132165465l, 2313153l, fingreso, fnac, departamento, obraSocial,
//				credencial);
//
//		codigo = 6321;
//		puertaVigilancia = new Puerta(codigo);
//
//		efec.abrirPuerta(puertaVigilancia);
//
//		// Validacion

//	}
//
//}
