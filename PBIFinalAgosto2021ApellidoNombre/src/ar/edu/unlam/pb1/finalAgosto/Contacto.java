package ar.edu.unlam.pb1.finalAgosto;

public class Contacto {

	/*
	 * Se deben incorporar los atributos necesarios.
	 * 
	 * � Nombre y Apellido: No se aceptan n�meros. � Celular: Compuesto del c�digo
	 * de pa�s + c�digo de �rea + n�mero de celular. � E-Mail: Debe contener al
	 * menos el s�mbolo �@� y el caracter �.�. � Direcci�n: Valor alfanum�rico. �
	 * C�digo Postal: Valor num�rico. � Localidad: Valor alfanum�rico. � Provincia.
	 * Enumerador que contenga las 23 provincias argentinas. � Es cliente (Si o No):
	 * Inicialmente se carga en �No�. � Desea ser llamado nuevamente (Si o No):
	 * Inicialmente se carga en �Si�.
	 */

	// ATRIBUTOS
	private String nombreYapellido;
	private String direccion;
	private String eMail;
	private int codPostal;
	private String localidad;
	private Provincia provincias;
	private boolean esCliente = false;
	private boolean deseaSerLlamadoNuevamente = true;
	// CELULAR
	private String codigoDePais;
	private String codigoDeArea;
	private String NumeroCel;
	private String celular = codigoDePais + codigoDeArea + NumeroCel;

	// CONSTRUCTOR

	public Contacto(String nombreYapellido, String direccion, String eMail, int codPostal, String localidad,
			Provincia provincias, boolean esCliente, boolean deseaSerLlamadoNuevamente, String codigoDePais,
			String codigoDeArea, String numeroCel, String celular) {
		super();
		this.nombreYapellido = nombreYapellido;
		this.direccion = direccion;
		this.eMail = eMail;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincias = provincias;
		this.esCliente = esCliente;
		this.deseaSerLlamadoNuevamente = deseaSerLlamadoNuevamente;
		this.codigoDePais = codigoDePais;
		this.codigoDeArea = codigoDeArea;
		NumeroCel = numeroCel;
		this.celular = celular;
	}

	public void esEmailValido(String eMail) {
		/*
		 * Eval�a si un String determinado puede ser almacenado como E-MAIL.
		 */
		verificarEmailValido(eMail);
	}

	private boolean verificarEmailValido(String eMailRecibido) {

		 boolean contiene = false;
		 char caracteres;
		for (int i = 0; i < eMailRecibido.length(); i++) {
		 caracteres=eMailRecibido.charAt(i);
		if (eMailRecibido=="@");
		return contiene = true;
		    }
		return contiene;
		}
	

	public boolean registrarNuevaLlamada(Llamada nueva) {
		/*
		 * Registra una nueva llamada asociada al contacto actual.
		 */
		return false;
	}

	@Override
	public String toString() {
		return "Contacto \n[ nombreYapellido=" + nombreYapellido + "\nDireccion=" + direccion + "\neMail=" + eMail
				+ "\nCodPostal=" + codPostal + "\nLocalidad=" + localidad + "\nProvincias=" + provincias
				+ "\nCodigoDePais=" + codigoDePais + "\nCodigoDeArea=" + codigoDeArea + "\nNumeroCel=" + NumeroCel
				+ "\nCelular=" + celular + "]";
	}
	

}
