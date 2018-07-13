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
		NotaNumerica nota = null;
		nota.setResultado(8);
		Tarea parcial=new Tarea();
		parcial.setNombre("Parcial");
		parcial.setNota(nota);
		
		Asignacion evaluacion=new Asignacion(parcial);
		
	
		
		Alumno miguel = new Alumno("miguel Richardson", 8525, "elMIGUELON");
		
		alumnos.add(ricardo);
	}
	
	public static DatosEstudiante getInstancia() {
		return estudiantesDatos;
	}
	
	public List<Alumno> getEstudiantes() {
		return alumnos;
	}
}
