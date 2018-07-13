package Model;

public class Tarea {
	private String nombre;
	private TipoNota nota;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoNota getNota() {
		return nota;
	}

	public void setNota(TipoNota nota) {
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
}
