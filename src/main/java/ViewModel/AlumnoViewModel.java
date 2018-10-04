package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import DatosAlumno.DatosEstudiante;
import Model.Alumno;
import Model.AsignacionPosta;

@Observable
public class AlumnoViewModel {
	
	private Alumno alumno;
	private String nombre;
	private int legajo;
	private String git;
	private List<AsignacionPosta> asignaciones;
	private boolean boolModificarMostrar;  
	
	private boolean visible;

	public AlumnoViewModel(Alumno alumno) {
		this.alumno = alumno;
		this.inicializarAlumno(alumno);
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public void inicializarAlumno (Alumno alumno) {
		this.nombre = alumno.getNombre();
		this.legajo = alumno.getLegajo();
		this.git = alumno.getGit();
		this.asignaciones = alumno.getAsignaciones();
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

	public String getGit() {
		return git;
	}

	public void setGit(String git) {
		this.git = git;
	}

	public List<AsignacionPosta> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<AsignacionPosta> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public boolean isBoolModificarMostrar() {
		return boolModificarMostrar;
	}

	public void setBoolModificarMostrar(boolean boolModificarMostrar) {
		this.boolModificarMostrar = boolModificarMostrar;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	
	
}
