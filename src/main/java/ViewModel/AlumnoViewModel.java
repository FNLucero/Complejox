package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import DatosAlumno.DatosEstudiante;
import Model.Alumno;
import Model.Asignacion;
import Model.ClienteHTTP;
import View.AlumnoView;
import View.ConfirmacionView;

@Observable
public class AlumnoViewModel {
	
	private Alumno alumno;
	private String nombre;
	private String apellido;
	private Integer legajo;
	private String github;
	private List<Asignacion> asignaciones;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void inicializarAlumno (Alumno alumno) {
		this.nombre = alumno.getNombre();
		this.apellido=alumno.getApellido();
		this.legajo = alumno.getLegajo();
		this.github = alumno.getGithub();
		this.asignaciones = alumno.getAsignaciones();
	}
	
	public void modificarAlumno(AlumnoView vista) {
		alumno.setNombre(nombre);	
		alumno.setApellido(apellido);	
		alumno.setGithub(github);
		alumno.setLegajo(legajo);
		
		
		subirModificacion();
		new ConfirmacionView(vista).open();
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

	public String getGithub() {
		return github;
	}

	public void setGithub(String git) {
		this.github = git;
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
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

	
	private void subirModificacion() {
		ClienteHTTP nexoAnube = new ClienteHTTP(alumno.getToken() ); 
		nexoAnube.actualizarAlumno(alumno);
	}
}
