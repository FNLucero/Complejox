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
public class ConfirmacionView extends SimpleWindow<ConfirmacionViewModel>{
	
	  public ConfirmacionView(WindowOwner owner) {
		    super(owner, new ConfirmacionViewModel( ) );
		  }
	  
	  @Override
		protected void addActions(Panel arg0) {
			// TODO Auto-generated method stub
			
		}

	  @Override
		protected void createFormPanel(Panel mainPanel) {
		
		  Label labelConfirmacion = new Label(mainPanel).setText("Se ha confirmado la modificacion");
		  	new Button(mainPanel).setCaption("Aceptar").onClick( this::close );
		}
}
