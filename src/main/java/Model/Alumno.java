package Model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import com.google.gson.annotations.SerializedName;


@Observable
public class Alumno {
	@SerializedName("assignments")
	private List<Asignacion> asignaciones;
	@SerializedName("first_name")
	private String nombre;
	@SerializedName("last_name")
	private String apellido;
	@SerializedName("code")
	private Integer legajo;
	@SerializedName("github_user")
	private String github;
	private String token;
	
	public Alumno() {}
	
	public Alumno(String nombre,int legajo,String git, String apellido) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.github = git;
		this.apellido = apellido;
		this.asignaciones = new ArrayList<Asignacion>();		
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}
	
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	
	public void setGithub(String git) {
		this.github = git;
	}
	
	public String getGithub() {
		return github;
	}
	


	public void asignarTarea(Asignacion asignacion) {
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
