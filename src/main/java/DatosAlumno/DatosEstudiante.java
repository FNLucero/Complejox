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
		NotaNumerica notaRicardo = new NotaNumerica();
		notaRicardo.setResultado(6);
		
		Tarea parcialRicardo = new Tarea();
		parcialRicardo.setNombre("Parcial Quimica");
		parcialRicardo.setNota(notaRicardo);
		
		Asignacion evaluacionRicardo = new Asignacion(parcialRicardo);
		
		ricardo.asignarTarea(evaluacionRicardo);
		
		alumnos.add(ricardo);
		
		//------ otro alumno --------
		
		Alumno miguel = new Alumno("Facundo Fraguaga", 8525, "PapuDePapus");
		NotaNumerica notaMiguel = new NotaNumerica();
		notaMiguel.setResultado(8);
		
		Tarea parcialMiguel = new Tarea();
		parcialMiguel.setNombre("Parcial Diseño de Sistemas");
		parcialMiguel.setNota(notaMiguel);
		
		Asignacion evaluacionMiguel = new Asignacion(parcialMiguel);
		
		ricardo.asignarTarea(evaluacionMiguel);
		
		alumnos.add(miguel);
	}
	
	public static DatosEstudiante getInstancia() {
		return estudiantesDatos;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
}
