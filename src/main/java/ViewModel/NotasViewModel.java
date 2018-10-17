package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import Model.Asignacion;
import Model.ClienteHTTP;

@Observable
public class NotasViewModel {
	public Alumno alumno;
	public List<Asignacion> asignacion;
	
	public NotasViewModel(Alumno alumno) {
		this.alumno = alumno;
		this.asignacion=this.getAsignaciones();
	}
	
	public List<Asignacion> getAsignaciones() {
		ClienteHTTP nexoAnube = new ClienteHTTP(alumno.getToken() ); 
		return nexoAnube.getAsignaciones();
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<Asignacion> getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(List<Asignacion> asignacion) {
		this.asignacion = asignacion;
	}
	
	
	
}
