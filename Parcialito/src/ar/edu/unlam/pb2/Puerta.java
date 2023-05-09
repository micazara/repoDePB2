package ar.edu.unlam.pb2;

public class Puerta {

	// ATRIBUTOS DE LA CLASE
	private Integer codigo;
	private Boolean abierta = false;
	private Boolean compatible;
	private TipoDePuerta tipodepuerta;

	// CONSTRUCTOR
	public Puerta(Integer codigo) {
		this.codigo = codigo;
	}

	Integer getCodigo() {
		return codigo;
	}

	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	Boolean getAbierta() {
		return abierta;
	}

	void setAbierta(Boolean abierta) {
		this.abierta = abierta;
	}

	// EL METODO QUE NOS DICE SI SE ABRE CON...
	public void meAbroConCredencial(Credencial credencial) {
		if (credencial.getTipoDeCredencial().equals(TipoCredencial.ALLACCESS)
				&& tipodepuerta.equals(TipoDePuerta.DEPOSITO) || tipodepuerta.equals(TipoDePuerta.ENTRADA)
				|| tipodepuerta.equals(TipoDePuerta.FABRICA))
			this.compatible=true;
		if (credencial.getTipoDeCredencial().equals(TipoCredencial.RESIDENTE)
				&& tipodepuerta.equals(TipoDePuerta.DEPOSITO) || tipodepuerta.equals(TipoDePuerta.ENTRADA)
				|| tipodepuerta.equals(TipoDePuerta.FABRICA))
		
			;

	}

}
