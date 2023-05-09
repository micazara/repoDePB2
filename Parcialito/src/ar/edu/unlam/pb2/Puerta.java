package ar.edu.unlam.pb2;

public class Puerta {

	private Integer codigo;
	private Boolean abierta;

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
	
	public abstract void meAbroConCredencial (Credencial credencial);

}
