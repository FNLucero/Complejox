package Model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Asignacion {
	
	
	private Tarea tipoTarea;
	
	public Tarea getTipoTarea() {
		return tipoTarea;
	}

	public void setTipoTarea(Tarea tipoTarea) {
		this.tipoTarea = tipoTarea;
	}

	private boolean estaAprobado;
	private boolean estado; // corregido = true, pendiente = false

	public Asignacion(Tarea tipoTarea) {
		this.tipoTarea = tipoTarea;
		estado = false;
		estaAprobado = false;
	}

	public void corregir(String concepto) {
		estado = true;
		estaAprobado = tipoTarea.getNota().estaAprobada();
	}

	public void corregir(int nota) {
		estado = true;
		estaAprobado = tipoTarea.getNota().estaAprobada();
	}

	public boolean getEstado() {
		return estado;
	}

	public boolean getEstaAprobado() {
		return estaAprobado;
	}
	
	@Override
	public String toString() {
		return tipoTarea.getNombre() + " Nota: " + tipoTarea.getNota().getResultado();
	}
}
