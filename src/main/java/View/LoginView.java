package View;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
//import org.uqbar.arena.
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;

import Model.Alumno;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;

import ViewModel.LoginViewModel;
import Model.*;

public class LoginView extends SimpleWindow<LoginViewModel>{
	
	  public LoginView(WindowOwner owner) {
		    super(owner, new LoginViewModel());
		  }

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		Label x=new Label(mainPanel).setText("escriba su token!");
		new Label(mainPanel).setText("                ");
		new Label(mainPanel).setText("                ");
		
		new TextBox(mainPanel).setWidth(150)
		.bindValueToProperty("token");
		
		new Button(mainPanel).setCaption("Loguearse")
	    .onClick(() ->  this.getModelObject().pedirAlumno(this));
	    
		
		
		
	}
}	
	

