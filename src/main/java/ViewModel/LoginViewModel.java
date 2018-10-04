package ViewModel;

import java.util.List;

import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;

import Model.LaWeaHTTP;
import View.AlumnoView;
import Model.Alumno;
import DatosAlumno.DatosEstudiante;

@Observable
public class LoginViewModel {
	
	private List<Alumno> alumnos;
	private Alumno alumno;
	private String token; 
	
	public LoginViewModel () {
		//alumnos = new DatosEstudiante().getInstancia().getAlumnos();
	} 

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public void pedirAlumno(WindowOwner owner) {
		LaWeaHTTP nexoAnube = new LaWeaHTTP(token);
		alumno = nexoAnube.getAlumno();
		alumno.setToken(token);
		new AlumnoView(owner, alumno).open();
	}
	
}
