package Model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;


@Observable
public class Alumno {
	private List<Asignacion> asignaciones;
	private String nombre;
	private int legajo;
	private String git;
	
	public Alumno(String nombre,int legajo,String git) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.git = git;
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

	public int getLegajo() {
		return legajo;
	}
	
	public String getGit() {
		return git;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public void asignarTarea(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}
}
