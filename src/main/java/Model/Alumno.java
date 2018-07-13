package Model;

import java.util.ArrayList;
import java.util.List;



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

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public void asignarTarea(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}
}
