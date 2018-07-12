package View;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ViewModel.ProfesorViewModel;

public class ProfesorView extends SimpleWindow<ProfesorViewModel>{
	


	public ProfesorView(WindowOwner owner) {
		    super(owner, new ProfesorViewModel());
	  }
	  
		@Override
		protected void addActions(Panel actionsPanel) {
		//	// TODO Auto-generated method stub
		}

		@Override
		protected void createFormPanel(Panel mainPanel) {
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
		    
		    Panel panelAbajo = new Panel (mainPanel);
		    panelAbajo.setLayout(new HorizontalLayout());
		    
		   /* Button BotonObtenerDatos = new Button(panelAbajo);
		    BotonObtenerDatos.setCaption("Obtener Datos") 
		    				 .onClick(() -> getModelObject().leerDatosEstudiante())
		    				 .setWidth(155)
		    				 .setHeight(30);*/
		    
		    new Label(panelAbajo).setText("   puto el que lee   ");
		   /* new Button(panelAbajo)
		    	.setCaption("Actualizar Datos")
		    	.onClick(() -> actualizarDatos())
		    	.setWidth(155)
		    	.setHeight(30);
		    
		    
		    new Button(mainPanel)	   
			.setCaption("Obtener Notas")
			.onClick(this::CrearVentana)
			.setHeight(30);*/
		}
	  
}
