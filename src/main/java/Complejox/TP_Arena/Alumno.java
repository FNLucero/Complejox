package Complejox.TP_Arena;

import java.util.List;

public class Alumno {
	public List<Asignacion> asignaciones;
	public String nombre;
	public int legajo;
	
	public void asignarTarea (Asignacion asignacion) {
		asignaciones.add(asignacion);
	}
}
