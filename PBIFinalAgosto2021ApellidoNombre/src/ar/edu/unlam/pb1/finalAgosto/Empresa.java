package ar.edu.unlam.pb1.finalAgosto;

public class Empresa {

	//ATRIBUTOS
	private String nombreEmpresa;
	private  Contacto[] contactos;
	
	public Empresa(String nombreEmpresa, int cantidadContactos) {
		// TODO Auto-generated constructor stub
		this.nombreEmpresa=nombreEmpresa;
		contactos= new Contacto [cantidadContactos];
	}

	

	public String getNombreEmpresa() {
		/*
		 * Devuelve el nombre de la empresa
		 */
		
		return nombreEmpresa;
	}
	
	public Contacto [] getContactos() {
		return contactos;
	}
	
	public boolean agregarNuevoContacto(Contacto nuevo) {
	
		/*
		 * Incorpora un nuevo contacto a la empresa
		 */
		boolean sePudoAgregar=true;
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i]!=null ||contactos[i].getNombreYapellido()!=nuevo.getNombreYapellido() ) {
				contactos[i]=nuevo;
			return sePudoAgregar;
			}else {
				sePudoAgregar=false;
			}
			
		}
		
		return false;
	}
	
	public boolean agregarNuevaZonaDeCobertura(int codigoPostal) {
		/*
		 * Incorpora una nueva zona de cobertura (Las zonas de cobertura se identifican por el codigo postal)
		 */
		
		return false;
	}	
	
	private boolean elCodigoPostalEstaDentroDeLaZonaDeCobertura(int codigoPostal) {
		/*
		 * Determina si un c�digo postal est� dentro de la zona de cobertura
		 */
		return false;
	}
	
	public Contacto buscarCandidato() {
		/*
		 * Para determinar qu� contacto el sistema debe mostrar, se debe realizar la siguiente b�squeda:
		 * 1.	El contacto NO debe ser cliente a�n.
		 * 2.	El contacto desea ser llamado o al menos no inform� lo contrario.
		 * 3.	El c�digo postal del contacto debe existir en las zonas de cobertura existente.
		 * 4.	Del conjunto de contactos resultante se debe seleccionar aleatoriamente el pr�ximo llamado.
		 */

		return null;
	}



	public void realizarNuevaLlamada() {
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
		
		for (int i = 0; i < contactos.length; i++) {
			
		}
		
	}
}
