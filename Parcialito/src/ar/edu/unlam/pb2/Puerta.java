package ar.edu.unlam.pb2;

public class Puerta {

	// ATRIBUTOS DE LA CLASE
	private Integer codigo;
	private Boolean abierta = false;
	private Boolean compatible;
	private TipoDePuerta tipodepuerta;

	// CONSTRUCTOR
	public Puerta(Integer codigo, TipoDePuerta tipodepuerta) {
		this.codigo = codigo;
		this.tipodepuerta=tipodepuerta;
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



}
