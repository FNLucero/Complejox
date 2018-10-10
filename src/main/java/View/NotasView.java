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
import Model.AsignacionPosta;
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

	@Override

	protected void createFormPanel(Panel formPanel) {

		String nombre = this.getModelObject().alumno.getNombre();
		this.setTitle("Notas de "+nombre);
		new Label(formPanel).setText("Notas de "+nombre);
		

				
				Selector<AsignacionPosta> selector = new Selector<AsignacionPosta>(formPanel);
				selector.bindValueToProperty("asignacion");
				
			    Table<TipoNota> tableNotas = new Table<TipoNota>(formPanel, TipoNota.class);
			    tableNotas.setHeight(500);
			    tableNotas.setWidth(350);
			    tableNotas.bindItemsToProperty("asignacion.notas");
			    
			    new Column<TipoNota>(tableNotas) 
			    .setTitle("Intento numero:")
			    .setFixedSize(100)
			    .bindContentsToProperty("id");
			    
			    new Column<TipoNota>(tableNotas) 
			    .setTitle("Nota")
			    .setFixedSize(100)
			    .bindContentsToProperty("value");
			   
			    new Column<TipoNota>(tableNotas) 
			    .setTitle("Estado")
			    .setFixedSize(150)
			    .bindContentsToProperty("aprobo");

			}
	}

