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
    private String  NumeroCel;
    private String celular= codigoDePais + codigoDeArea + NumeroCel;
   
   
    public void esEmailValido(String eMail) {
		/*
		 * Eval�a si un String determinado puede ser almacenado como E-MAIL.
		 */
	}

	public boolean registrarNuevaLlamada(Llamada nueva) {
		/*
		 * Registra una nueva llamada asociada al contacto actual.
		 */
		return false;
	}

	public String toString() {
		/*
		 * Muestra los datos de un contacto, entre los que se debe incluir el registro
		 * de las llamadas realizadas.
		 */

		return "";
	}

}
