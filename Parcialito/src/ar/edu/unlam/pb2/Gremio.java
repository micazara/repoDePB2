package ar.edu.unlam.pb2;

public class Gremio {
	
	//ATRIBUTOS DE CLASE
	private Long cod;
	private String tipo;
	private String nombre;
	
	//CONSTRUCTOR
	public Gremio(Long cod, String tipo, String nombre) {
		
		this.cod = cod;
		this.tipo = tipo;
		this.nombre = nombre;
	}

	protected Long getCod() {
		return cod;
	}

	protected void setCod(Long cod) {
		this.cod = cod;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	



}
