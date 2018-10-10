package ViewModel;

import org.uqbar.commons.model.annotations.Observable;
import org.uqbar.lacar.ui.model.Action;

import Model.LaWeaHTTP;
import Model.Alumno;
@Observable
public class ModificarViewModel {
	public String valor;
	public Alumno alumno;
	private AlumnoViewModel ViewAnterior;
	
	public ModificarViewModel(Alumno alumno , AlumnoViewModel ViewAnterior) {
		this.alumno = alumno;
		this.ViewAnterior = ViewAnterior;
		System.out.println(alumno.getNombre());

	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
	public void ModificarNonbre() {
		 this.alumno.setNombre(valor);
		 this.ViewAnterior.inicializarAlumno(alumno);
		 this.subirModificacion();
	}
	
	public void ModificarApellido() {
		 this.alumno.setApellido(valor);
		 this.ViewAnterior.inicializarAlumno(alumno);
		 this.subirModificacion();
	}
	
	public void  ModificarGit() {
		this.alumno.setgit(valor);;
		this.ViewAnterior.inicializarAlumno(alumno);
		this.subirModificacion();
	}
	
	public void ModificarLegajo() {
		this.alumno.setLegajo( Integer.parseInt(valor) );
		this.ViewAnterior.inicializarAlumno(alumno);
		this.subirModificacion();
	}
	
	private void subirModificacion() {
		LaWeaHTTP nexoAnube = new LaWeaHTTP(alumno.getToken() ); 
		nexoAnube.actualizarAlumno(alumno);
	}
	

}
