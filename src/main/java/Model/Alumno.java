package Model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import com.google.gson.annotations.SerializedName;


@Observable
public class Alumno {
	private List<AsignacionPosta> asignaciones;
	@SerializedName("first_name")
	private String nombre;
	@SerializedName("last_name")
	private String apellido;
	@SerializedName("code")
	private int legajo;
	@SerializedName("github_user")
	private String git;
	private String token;
	
	public Alumno() {}
	
	public Alumno(String nombre,int legajo,String git, String apellido) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.git = git;
		this.apellido = apellido;
		this.asignaciones = new ArrayList<AsignacionPosta>();		
	}

	public List<AsignacionPosta> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<AsignacionPosta> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}
	
	public String getGit() {
		return git;
	}
	
	public void setgit(String git) {
		this.git =  git;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public void asignarTarea(AsignacionPosta asignacion) {
		asignaciones.add(asignacion);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
