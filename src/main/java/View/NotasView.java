package View;

import java.util.List;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import Model.Asignacion;
import Model.TipoNota;
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
	
	private String transformer(List<TipoNota> notas) {
		String a = "";
		for (TipoNota nota : notas)
			a += nota.getValue() + "  ";
		return a;
	}

	@Override

	protected void createFormPanel(Panel formPanel) {

		String nombre = this.getModelObject().alumno.getNombre();
		this.setTitle("Notas de "+nombre);
		new Label(formPanel).setText("Notas de "+nombre);
		

				Table<Asignacion> tableNotas = new Table<>(formPanel, Asignacion.class);
				tableNotas.setHeight(300);
				tableNotas.bindItemsToProperty("asignacion");
			    

				Column<Asignacion> columnaNombre =new Column<Asignacion>(tableNotas);
				columnaNombre.setTitle("Tarea:");
				columnaNombre.bindContentsToProperty("titulo");
				columnaNombre.setFixedSize(100);
				
				
				Column<Asignacion> columnaNota = new Column<Asignacion>(tableNotas);
				columnaNota.setTitle("Notas");
				columnaNota.bindContentsToProperty("notas").setTransformer(notas -> transformer((List<TipoNota>) notas));;
				columnaNota.setFixedSize(200);
			    

				Column<Asignacion> columnaAprobada = new Column<Asignacion>(tableNotas);
				columnaAprobada.setTitle("Aprobado");
				columnaAprobada.bindContentsToProperty("estaAprobado");
				columnaAprobada.setFixedSize(100);
				
			}
	}

