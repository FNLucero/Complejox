package Model;

import java.util.List;

public class Profesor {
	public List<Alumno> Alumnos;
	
	public void asignarTareaAsusAlumnos (Tarea tarea) {
		this.Alumnos.stream().forEach(Alumno -> Alumno.asignarTarea(new Asignacion(tarea) ) ); 
	}
	
}
