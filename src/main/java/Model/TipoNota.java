package Model;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import java.util.Arrays;

@Observable
public class TipoNota {
	private int id;
	private String value;
	private String create_at;
	private String update_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	
	public boolean aprobo() {
		List<String> notasAprobadas = Arrays.asList ("MB+","MB","MB-","B+","B","B-","R+","R","R-","10","9","8","7","6");
		return notasAprobadas.contains(value);
	}

	public Aprobacion getAprobado() {
		return (this.aprobo() ) ? Aprobacion.Aprobado : Aprobacion.Desaprobado;
	}
	
	public enum Aprobacion{
		Aprobado,Desaprobado
	}
	
	
}
