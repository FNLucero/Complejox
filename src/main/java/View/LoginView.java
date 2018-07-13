package View;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import Model.Alumno;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.CheckBox;

import ViewModel.LoginViewModel;

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
		Label x=new Label(mainPanel).setText("ELIJA SU CLASE");
		new Label(mainPanel).setText("                ");
		new Label(mainPanel).setText("                ");
		
		CheckBox Profesor = new CheckBox(mainPanel).
				;
		//checkResumen.bindEnabledToProperty("habilitaResumenCuenta");
		//checkResumen.bindValueToProperty("recibeResumenCuenta");
	
		CheckBox Alumno = new CheckBox(mainPanel);
	}	
}
