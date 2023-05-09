package ar.edu.unlam.pb2;

public class Puerta {

	// ATRIBUTOS DE LA CLASE
	private Integer codigo;
	private Boolean abierta = false;
	private Boolean compatible = false;
	private TipoDePuerta tipodepuerta;

	// CONSTRUCTOR
	public Puerta(Integer codigo, TipoDePuerta tipodepuerta) {
		this.codigo = codigo;
		this.tipodepuerta = tipodepuerta;
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
	public boolean meAbroConCredencial(Credencial credencial) {

		if (credencial.getTipoDeCredencial().equals(TipoCredencial.ALLACCESS)
				&& tipodepuerta.equals(TipoDePuerta.DEPOSITO) || tipodepuerta.equals(TipoDePuerta.ENTRADA)
				|| tipodepuerta.equals(TipoDePuerta.FABRICA)){
			this.compatible = true;}

		else if (credencial.getTipoDeCredencial().equals(TipoCredencial.RESIDENTE)
				&& tipodepuerta.equals(TipoDePuerta.ENTRADA) || tipodepuerta.equals(TipoDePuerta.FABRICA)) {
			
		this.compatible = true;}

		else if (credencial.getTipoDeCredencial().equals(TipoCredencial.VISITANTE) && 
				tipodepuerta.equals(TipoDePuerta.ENTRADA)){
			
		this.compatible = true;}
		
		else {
			this.compatible=false;
		}

		return compatible;
	}

}
