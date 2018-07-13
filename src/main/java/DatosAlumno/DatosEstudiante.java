package DatosAlumno;

import java.util.ArrayList;
import java.util.List;

import Model.*;

public class DatosEstudiante {
	
	private static DatosEstudiante estudiantesDatos = new DatosEstudiante();
	private List<Alumno> alumnos;
	
	public DatosEstudiante() {
		alumnos = new ArrayList<Alumno>();
		cargarAlumnos();
	}
	
	private void cargarAlumnos() {
		
		Alumno ricardo = new Alumno("richard rodriguez",2585,"ricardito2582");
		
		Tarea parcial=new Tarea();
		parcial.setNombre("Parcial");
		parcial.setNota();
		
		
		Asignacion evaluacion=new Asignacion();
		
		/*
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), NotaConceptual.MB);
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), NotaConceptual.B);
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), new NotaNumerica(8.0));
		bruno.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(8.74));
		bruno.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(9.1));*/
		
		Alumno miguel = new Alumno("miguel Richardson", 8525, "elMIGUELON");
		/*rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), new NotaNumerica(9.6));
		rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), new NotaNumerica(10.0));
		rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), NotaConceptual.B_mas);*/

		/*
		estudiantes.add(bruno);
		estudiantes.add(rodrigo);
		estudiantes.add(nicolas);*/
	}
	
	public static DatosEstudiante getInstancia() {
		return estudiantesDatos;
	}
	
	public List<Alumno> getEstudiantes() {
		return alumnos;
	}
}
