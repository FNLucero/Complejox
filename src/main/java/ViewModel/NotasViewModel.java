package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import Model.Asignacion;

@Observable
public class NotasViewModel {
	public Alumno alumno;
	public List<Asignacion> asignaciones;

	public NotasViewModel(Alumno alumno) {
		this.alumno = alumno;
		this.asignaciones = this.getAsignaciones();
	}

	public List<Asignacion> getAsignaciones() {
		return alumno.getAsignaciones();
	}
}
