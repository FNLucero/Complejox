package Model;

import java.util.List;

public class Profesor {
	private List<Alumno> Alumnos;

	public void asignarTareaAsusAlumnos(int id, String titulo, String descripcion, List<TipoNota> notas) {
		this.Alumnos.stream().forEach(Alumno -> Alumno.asignarTarea(new AsignacionPosta(id,titulo,  descripcion, notas)));
	}

}
