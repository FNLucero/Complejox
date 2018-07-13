package View;

import java.util.List;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import Model.Alumno;
import ViewModel.AlumnoViewModel;
import ViewModel.NotasViewModel;
import Model.Asignacion;

public class NotasView extends SimpleWindow<NotasViewModel> {

	public NotasView(WindowOwner owner, Alumno alumno) {
		super(owner, new NotasViewModel(alumno));
	}

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Table<Asignacion> tabla = new Table<Asignacion>(mainPanel, Asignacion.class);
		tabla.bindItemsToProperty("asignaciones");
		
		
		Column<Asignacion> columnaNombre = new Column<Asignacion>(tabla);
		columnaNombre.setTitle("Tareas");
		columnaNombre.bindContentsToProperty("tipoTarea.nota");
		columnaNombre.setFixedSize(200);
		
		Column<Asignacion> columnaNota = new Column<Asignacion>(tabla);
		columnaNota.setTitle("Notas");
		columnaNota.bindContentsToProperty("tipoTarea.nota.resultado").setTransformer(resultado -> parsearNota( (Integer) resultado ) );
		columnaNota.setFixedSize(200);
		/*
		*/
	}

	private String parsearNota (Integer nota) {
		return nota.toString();
	}
}
