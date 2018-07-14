package View;

import java.util.List;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import Model.Asignacion;
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

	protected void createFormPanel(Panel formPanel) {

		String nombre = this.getModelObject().alumno.getNombre();
		this.setTitle("Notas de "+nombre);
		new Label(formPanel).setText("Notas de "+nombre);

		Table<Asignacion> tableNotas = new Table<>(formPanel, Asignacion.class);
		tableNotas.bindItemsToProperty("asignaciones");
		
	}
}
