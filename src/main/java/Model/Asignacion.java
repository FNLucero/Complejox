package Model;

public class Asignacion {

	private Tarea tipoTarea;
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
}
