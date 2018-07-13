package View;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import Model.Alumno;
import ViewModel.AlumnoViewModel;
import ViewModel.NotasViewModel;

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
		Table<Alumno> tabla = new Table<Alumno>(mainPanel, Alumno.class);
		tabla.bindItemsToProperty("asignaciones");
		//tabla.bindItemsToProperty("asignaciones");
	}

}
