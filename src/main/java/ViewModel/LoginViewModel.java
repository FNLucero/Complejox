package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import DatosAlumno.DatosEstudiante;

@Observable
public class LoginViewModel {
	
	private List<Alumno> alumnos;
	private Alumno alumno;
	
	public LoginViewModel () {
		alumnos = new DatosEstudiante().getInstancia().getAlumnos();
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
	
	
}
