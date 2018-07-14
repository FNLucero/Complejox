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


public class AlumnoView extends SimpleWindow<AlumnoViewModel>{
	  public AlumnoView(WindowOwner owner, Alumno alumno) {
		    super(owner, new AlumnoViewModel(alumno) );
		  }
	  
	  
	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		
		new Label(mainPanel).setText("Marque si desea ver los datos del alumno ");
		
		CheckBox checkMostrarModificar = new CheckBox(mainPanel);
		checkMostrarModificar.bindValueToProperty("visible");
		
		setTitle("Datos: ");
	    Panel panelDatos = new Panel (mainPanel);
	    panelDatos.setLayout(new ColumnLayout(2));
	    
	    Label labelCodigo = new Label(panelDatos).setText("Legajo");	    				
	    TextBox TextBoxCodigo = new NumericField(panelDatos);
	    TextBoxCodigo.setWidth(150).bindValueToProperty("legajo");
	    TextBoxCodigo.bindVisibleToProperty("visible");
	    						
	    Label labelNombre = new Label(panelDatos).setText("Nombre");
	    TextBox TextBoxNombre = new TextBox(panelDatos);
	    TextBoxNombre.setWidth(150).bindValueToProperty("nombre");
	    TextBoxNombre.bindVisibleToProperty("visible");
	    
	    Label labelGit = new Label(panelDatos).setText("GitHub");
	    TextBox TextBoxGit = new TextBox(panelDatos);
	    TextBoxGit.setWidth(150).bindValueToProperty("git");
	    TextBoxGit.bindVisibleToProperty("visible");
	    

	    labelNombre.bindVisibleToProperty("visible");
	    labelCodigo.bindVisibleToProperty("visible");
	    labelGit.bindVisibleToProperty("visible");

	    
	    new Button(mainPanel).setCaption("Modificar Datos").onClick(() -> new ModificarView(this, this.getModelObject().getAlumno() , this.getModelObject() ).open());	    
	    
	    new Button(mainPanel).setCaption("Consultar Notas").onClick(()-> new NotasView(this, this.getModelObject().getAlumno() ).open());
	   
	
	}
	
}
