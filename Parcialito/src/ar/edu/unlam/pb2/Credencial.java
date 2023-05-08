package ar.edu.unlam.pb2;

import java.util.Objects;

public class Credencial {
	

	//ATRIBUTOS CLASE
	private Integer id;
	private TipoCredencial tipoDeCredencial;
	
	//CONSTRUCTOR
	public Credencial(Integer id, TipoCredencial tipoDeCredencial) {
		
		this.id = id;
		this.tipoDeCredencial = tipoDeCredencial;
	}

	protected Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected TipoCredencial getTipoDeCredencial() {
		return tipoDeCredencial;
	}

	protected void setTipoDeCredencial(TipoCredencial tipoDeCredencial) {
		this.tipoDeCredencial = tipoDeCredencial;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Credencial other = (Credencial) obj;
		return Objects.equals(id, other.id);
	}
}
