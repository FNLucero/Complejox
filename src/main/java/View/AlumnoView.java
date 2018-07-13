package View;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ViewModel.*;

public class AlumnoView extends SimpleWindow<AlumnoViewModel>{
	
	  public AlumnoView(WindowOwner owner) {
		    super(owner, new AlumnoViewModel());
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
		setTitle("Datos: ");
	    Panel panelArriba = new Panel (mainPanel);
	    panelArriba.setLayout(new ColumnLayout(2));
  
	    new Label(panelArriba).setText("Codigo");	    				
	    new NumericField(panelArriba).setWidth(150)
	    .bindValueToProperty("alumno.code");
	    						
	    new Label(panelArriba).setText("Nombre");
	    new TextBox(panelArriba).setWidth(150)
	    			.bindValueToProperty("alumno.first_name");
	    
	    new Label(panelArriba).setText("Apellido");
	    new TextBox(panelArriba).setWidth(150)
	    					    .bindValueToProperty("alumno.last_name");
	    
	    new Label(panelArriba).setText("GitHub");
	    new TextBox(panelArriba).setWidth(150)
	    						.bindValueToProperty("alumno.github_user");
		
		
		
	}
	
}
