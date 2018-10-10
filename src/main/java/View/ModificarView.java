package View;


import org.uqbar.arena.layout.ColumnLayout;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;


import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;


import Model.Alumno;
import ViewModel.*;
@SuppressWarnings("serial")
//@Observable
public class ModificarView extends SimpleWindow<ModificarViewModel>{
	
	  public ModificarView(WindowOwner owner, Alumno alumno, AlumnoViewModel ViewAnterior) {
		    super(owner, new ModificarViewModel(alumno, ViewAnterior) );
		  }
	  
	  @Override
		protected void addActions(Panel arg0) {
			// TODO Auto-generated method stub
			
		}

	  @Override
		protected void createFormPanel(Panel mainPanel) {
		
		    new TextBox(mainPanel).setWidth(150)
			.bindValueToProperty("valor");
		    
		    new Button(mainPanel).setCaption("Modificar Nombre")
		    .onClick(()->this.getModelObject().ModificarNonbre());
		    
		    new Button(mainPanel).setCaption("Modificar Apellido")
		    .onClick(()->this.getModelObject().ModificarApellido());
		    
		    new Button(mainPanel).setCaption("Modificar Legajo")
		    .onClick(()->this.getModelObject().ModificarLegajo());
		    
		    new Button(mainPanel).setCaption("Modificar GIT")
		    .onClick(()->this.getModelObject().ModificarGit());
			

		
		}
}
