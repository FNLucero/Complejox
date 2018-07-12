package View;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

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
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}	
}
