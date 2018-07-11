package Model;

import java.util.List;

public class Asignacion {
	
	public Tarea tarea;
	public List<Integer> notas;
	//ahora lo deje como una lista de integer, pero esto va a terminar siendo otra cosa
	
	public Asignacion(Tarea tarea) {
		this.tarea = tarea;
	}
	
}
