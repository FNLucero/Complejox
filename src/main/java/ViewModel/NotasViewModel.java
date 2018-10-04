package ViewModel;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import Model.AsignacionPosta;
import Model.LaWeaHTTP;

@Observable
public class NotasViewModel {
	public Alumno alumno;
	public AsignacionPosta asignacion;
	

	public NotasViewModel(Alumno alumno) {
		this.alumno = alumno;
		
	}

	public List<AsignacionPosta> getAsignacionPosta() {
		LaWeaHTTP nexoAnube = new LaWeaHTTP(alumno.getToken() ); 
		return nexoAnube.getAsignaciones();
	}
}
