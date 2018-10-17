package Model;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import com.google.gson.annotations.SerializedName;

@Observable
public class Asignacion {
	
	private int id;
	@SerializedName("title")
	private String titulo;
	@SerializedName("description")
	private String descripcion;
	@SerializedName("grades")
	private List<TipoNota> notas;
	
	public Asignacion() {}
	
	public Asignacion(int id, String titulo, String descripcion, List<TipoNota> notas) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.notas = notas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<TipoNota> getNotas() {
		return notas;
	}
	public void setNotas(List<TipoNota> notas) {
		this.notas = notas;
	}
	public String estaAprobado() {
		return (this.getNotas().stream().anyMatch( nota->nota.aprobo() ) ) ? "SI" : "NO";
	}
	
}
