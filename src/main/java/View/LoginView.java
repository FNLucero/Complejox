package View;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
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
		Label x=new Label(mainPanel).setText("¿ Quien es usted ?");
		new Label(mainPanel).setText("                ");
		new Label(mainPanel).setText("                ");
		
		Selector<Alumno> selector = new Selector<Alumno>(mainPanel);		
		selector.bindValueToProperty("alumno");
		
		Binding<Alumno, Selector<Alumno>, ListBuilder<Alumno>> bindingItems = 
				selector.bindItems(new ObservableProperty<Alumno>(this.getModelObject(), "alumnos"));
		
		bindingItems.setAdapter(new PropertyAdapter(Alumno.class, "nombre"));
		
		new Button(mainPanel).setCaption("Loguearse")
	    .onClick(() -> new AlumnoView(this, this.getModelObject().getAlumno()).open()).setAsDefault().disableOnError();
		
	}
}	
	

