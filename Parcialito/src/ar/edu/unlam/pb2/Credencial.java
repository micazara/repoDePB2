package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Credencial {

	// ATRIBUTOS CLASE
	private Integer id;
	private TipoCredencial tipoDeCredencial;
	private ArrayList<Accesos> listaAcceso;

	// CONSTRUCTOR
	public Credencial(Integer id, TipoCredencial tipoDeCredencial) {

		this.id = id;
		this.tipoDeCredencial = tipoDeCredencial;
		this.listaAcceso = new ArrayList<Accesos>();

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

	public Integer getCantidadAccesos() {
		return listaAcceso.size();
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

	public void guardarAcceso(Boolean seAbrio, Puerta puerta, LocalDateTime fechaIngreso) {

		Accesos accesoReciente = new Accesos(seAbrio, fechaIngreso, puerta);
		this.listaAcceso.add(accesoReciente);

	}

	public boolean add(Accesos primerAcceso) {

		return this.listaAcceso.add(primerAcceso);

	}

}
