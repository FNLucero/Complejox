package Model;

import java.util.List;

public class Profesor {
	private List<Alumno> Alumnos;

	public void asignarTareaAsusAlumnos(Tarea tarea) {
		this.Alumnos.stream().forEach(Alumno -> Alumno.asignarTarea(new Asignacion(tarea)));
	}

}
