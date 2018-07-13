package View;

import java.util.List;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;

import Model.Alumno;
import ViewModel.*;
import Model.Asignacion;
//@Observable
public class AlumnoView extends SimpleWindow<AlumnoViewModel>{
	
	  public AlumnoView(WindowOwner owner, Alumno alumno) {
		    super(owner, new AlumnoViewModel(alumno) );
		  }
	  
	  public void CrearVentana(){
		// new NotasView(this,this.getModelObject().getToken()).open();
	  }
	  
	  
	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		CheckBox checkMostrarModificar = new CheckBox(mainPanel);
		checkMostrarModificar.bindValueToProperty("boolModificarMostrar");
		
		
		setTitle("Datos: ");
	    Panel panelModificarDatos = new Panel (mainPanel);
	    panelModificarDatos.setLayout(new ColumnLayout(2));
	    
	    new Label(panelModificarDatos).setText("Codigo");	    				
	    new NumericField(panelModificarDatos).setWidth(150)
	    .bindValueToProperty("legajo");
	    						
	    new Label(panelModificarDatos).setText("Nombre");
	    new TextBox(panelModificarDatos).setWidth(150)
	    			.bindValueToProperty("nombre");
	    
	    new Label(panelModificarDatos).setText("GitHub");
	    new TextBox(panelModificarDatos).setWidth(150)
	    						.bindValueToProperty("git");
	    
	    Panel panelMostrarDatos = new Panel (mainPanel);
	    panelMostrarDatos.setLayout(new ColumnLayout(2));
	    

	    new Button(mainPanel).setCaption("Modificar Datos")
	    .onClick(() -> new ModificarView(this, this.getModelObject().getAlumno()).open());
	    
	    /*
	    Table<Asignacion> tableDeNotas = new Table<>(panelMostrarDatos, Asignacion.class);
		tableDeNotas.bindItemsToProperty("asignaciones");
		
		Column<Asignacion> columnaConNombre = new Column<Asignacion>(tableDeNotas);
		columnaConNombre.setTitle("Asignacion");
		columnaConNombre.bindContentsToProperty("Asignacion.tipoTarea.nombre");
		columnaConNombre.setFixedSize(100);*/
	
	}
	
}
