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
		/*
		Alumno ricardo = new Alumno("richard",2585,"ricardito2582","rodriguez");
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
		parcialMiguel.setNombre("Parcial Dise�o de Sistemas");
		parcialMiguel.setNota(notaMiguel);
		
		Asignacion evaluacionMiguel = new Asignacion(parcialMiguel);
		
		TipoConceptual notaMiguel2 = new TipoConceptual();
		notaMiguel2.setResultado(5);
		
		Tarea parcialMiguel2 = new Tarea();
		parcialMiguel2.setNombre("Parcial de Sistemas");
		parcialMiguel2.setNota(notaMiguel2);
		
		Asignacion evaluacionMiguel2 = new Asignacion(parcialMiguel2);
		
		miguel.asignarTarea(evaluacionMiguel);
		miguel.asignarTarea(evaluacionMiguel2);
		
		alumnos.add(miguel);*/
		
		
	}
	
	public static DatosEstudiante getInstancia() {
		return estudiantesDatos;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
}
