package Aplicacion;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.MessageBox;
import org.uqbar.arena.windows.Window;

import View.LoginView;
import View.ProfesorView;

public class VisorDeNotas extends Application{
	public static void main(String[] args) {
		new VisorDeNotas().start();	
	}
	@Override
	protected Window<?> createMainWindow()  {
		return new LoginView(this);
	}
}
