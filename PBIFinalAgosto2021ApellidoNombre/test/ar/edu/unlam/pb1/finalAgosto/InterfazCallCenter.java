package ar.edu.unlam.pb1.finalAgosto;

import java.util.Scanner;
import ar.edu.unlam.pb1.finalAgosto.Contacto;

public class InterfazCallCenter {
	// TECLADO
	static Scanner teclado = new Scanner(System.in);

	private static final int CANTIDAD_MAXIMA_CONTACTOS = 25;

	public static void main(String args[]) {
		// CREO LA EMPRESA, HARDCODEO NOMBRE Y MAX CONTACTOS
		String nombreEmpresa = "Unlam-Call";
		mostrarMensaje("Bienvenido a " + nombreEmpresa);
		Empresa empresa = new Empresa(nombreEmpresa, CANTIDAD_MAXIMA_CONTACTOS);

		// MENU
		System.out.println("Bienvenido al callcenter");
		// OPCIONES MENU
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Incorporar zona de cobertura");
		System.out.println("2 - Dar de alta un nuevo contacto");
		System.out.println("3 - Realizar nueva llamada");
		System.out.println("4 - Ver informaci�n del contacto");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");

		// LOGICA MENU
		int opcion = 0;
		opcion = teclado.nextInt();
		do {
			switch (opcion) {
			case 1:
				incorporarZonaDeCobertura(teclado, empresa);
				break;
			case 2:
				darDeAltaNuevoContacto(teclado, empresa);
				break;
			case 3:
				realizarNuevaLlamada(teclado, empresa);
				break;
			case 4:
//				empresa.
				verInformacionDelContacto();
				break;
			default:
				mostrarMensaje("La opcion ingresada no existe :( intente otra vez ;) ");

			}

		} while (opcion != 9);

		teclado.close();
	}

	private static void incorporarZonaDeCobertura(Scanner teclado, Empresa empresa) {
		/*
		 * Se registra un nuevo c�digo postal dentro de la zona de cobertura de la
		 * empresa
		 */

		mostrarMensaje("INCORPORAR NUEVA ZONA DE COBERTURA");
		System.out.println("PROBANDOOOOO SOY MICA!!!");
		mostrarMensaje("....................................");
		mostrarMensaje("Ingrese un -nuevo- codigo postal");
		Integer codigoPostal = teclado.nextInt();
		if (empresa.agregarNuevaZonaDeCobertura(codigoPostal)) {
			mostrarMensaje("Se registro nueva zona de cobertura");
		} else {
			mostrarMensaje("no se pudo registar la nueva zona de cobertura");
		}

	}

	private static void darDeAltaNuevoContacto(Scanner teclado2, Empresa empresa) {
		/*
		 * Registra un nuevo contacto en la empresa
		 */

		// PEDIDO DE DATOS PARA NEW CONTACT
		mostrarMensaje("Vamos a agregar un nuevo contacto,si?");
		mostrarMensaje(".....................................");
		mostrarMensaje("Ingrese Nombre y Apellido");
		String nombreYapellido = teclado.next();
		mostrarMensaje("Ingrese su dirección");
		String direccion = teclado.next();
		mostrarMensaje("Ingrese su eMail");
		String eMail = teclado.next();
		mostrarMensaje("Ingrese su Localidad");
		String localidad = teclado.next();
		// PROVINVIA ENUM
		int opcion = 0;
		do {
			mostrarMensaje("Elija el numero que corresponda a su Pvcia:");
			mostrarMensaje("0.Bs As 1.CABA 2.CATAMARCA 3.CHACO " + "4.CHUBUT 5.CORDOBA 6.CORRIENTES 7.ENTRE RIOS"
					+ " 8.FORMOSA 9.JUJUY 10.LA PAMPA 11.LA RIOJA 12.MENDOZA 13.MISONES 14.NEUQUEN 15.RIO NEGRO 16.SALTA 17.SAN JUAN 18.SAN LUIS 19.SANTA CRUZ 20.SANTA FE 21.SANTIAGO DEL ESTERO "
					+ "22.TIERRA DEL FUEGO 23.TUCUMAN");
			opcion = teclado.nextInt();
		} while (opcion < 0 || opcion > 2);
		Provincia provincia = Provincia.values()[opcion];
		// SIGO PIDIENDO DATOS RESTANTES PARA NEW CONTACT
		mostrarMensaje("Ingrese su codigo postal");
		int codPostal = teclado.nextInt();
		mostrarMensaje("Ingrese su codigoDePais");
		String codigoDePais = teclado.next();
		mostrarMensaje("Ingrese su codigoDeArea");
		String codigoDeArea = teclado.next();
		mostrarMensaje("Ingrese su numero de celular");
		String numCel = teclado.next();
		boolean esCliente = false;
		do {
			mostrarMensaje("Es cliente?" + " Ingrese 1 para si o 2 para no");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				esCliente = true;
			case 2:
				esCliente = false;
			default:
				mostrarMensaje("opcion incorrecta");
			}
		} while (opcion != 1 || opcion != 2);
		// CREO AL CONTACTO
		Contacto contacto = new Contacto(nombreYapellido, direccion, eMail, localidad, provincia, codPostal,
				codigoDePais, codigoDeArea, numCel, esCliente);
		if (empresa.agregarNuevoContacto(contacto)) {
			mostrarMensaje("********************************");
			mostrarMensaje("Se pudo registrar el nuevo contacto : ");
			mostrarMensaje(contacto.toString());
			mostrarMensaje("********************************");

		} else {
			mostrarMensaje("No se pudo dar de alta un nuevo contacto");
		}

	}

	private static void realizarNuevaLlamada(Scanner teclado, Empresa empresa) {
		/*
		 * Busca un candidato, muestra los datos del mismo, y permite almacenar el
		 * resultado de la llamada.
		 * 
		 * a. Si la llamada fue exitosa (en ese caso el contacto pasa a ser cliente, y
		 * no se lo debe volver a llamar). b. Si el contacto no desea ser llamado
		 * nuevamente (la llamada pudo no haber sido exitosa, pero se haga un nuevo
		 * intento en el futuro). c. Observaciones: Texto libre donde el operador deja
		 * registro de lo conversado.
		 */
		empresa.realizarNuevaLlamada();

	}

	private static void verInformacionDelContacto() {
		/*
		 * Se visualiza la informaci�n del contacto, incluso el listado de las llamadas
		 * que se le hicieron
		 */

//		for (int i = 0; i < atencionesEspecie.length; i++) {
//			if (atencionesEspecie[i] != null) {
//				mostrarMensaje("\nAtencion: " + atencionesEspecie[i].toString());
//			}
//		} 
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
