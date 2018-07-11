package Complejox.TP_Arena;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profesor {
	public List<Alumno> Alumnos;
	
	public void asignarTareaAsusAlumnos (Tarea tarea) {
		this.Alumnos.stream().forEach(Alumno -> Alumno.asignarTarea(new Asignacion(tarea) ) ); 
	}
	
}
