package ViewModel;

import org.uqbar.commons.model.annotations.Observable;
import org.uqbar.lacar.ui.model.Action;

import Model.Alumno;
@Observable
public class ModificarViewModel {
	public String valor;
	public Alumno alumno;
	
	
	public ModificarViewModel(Alumno alumno) {
		this.alumno = alumno;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
	public void ModificarNonbre() {
		 this.alumno.setNombre(valor);
	}
	
	public void  ModificarGit() {
		this.alumno.setgit(valor);;
	}
	
	public void ModificarLegajo() {
		this.alumno.setLegajo( Integer.parseInt(valor) );
	}
	

}
