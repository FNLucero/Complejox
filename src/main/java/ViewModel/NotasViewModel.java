package ViewModel;

import java.util.List;
import Model.Alumno;
import Model.Asignacion;

public class NotasViewModel {
	public Alumno alumno;

	public NotasViewModel(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<Asignacion> getAsignaciones() {
		return alumno.getAsignaciones();
	}
}
