package View;


import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;

import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.annotations.Observable;


import Model.Alumno;
import ViewModel.ModificarViewModel;
@SuppressWarnings("serial")
//@Observable
public class ModificarView extends SimpleWindow<ModificarViewModel>{

	public ModificarView(WindowOwner owner,Alumno alumno) {
		super(owner, new ModificarViewModel(alumno));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
	    new TextBox(mainPanel).setWidth(150)
		.bindValueToProperty("valor");
	    
	    new Button(mainPanel).setCaption("Modificar Nombre")
	    .onClick(()->this.getModelObject().ModificarNonbre());
	    
	    
	    new Button(mainPanel).setCaption("Modificar Legajo")
	    .onClick(()->this.getModelObject().ModificarLegajo());
	    
	    new Button(mainPanel).setCaption("Modificar GIT")
	    .onClick(()->this.getModelObject().ModificarGit());
		
	}
}
