package Model;

public class NotaNumerica implements TipoNota {

	private static final int NOTA_MINIMA = 6;
	
	@Override
	public boolean estaAprobada(int resul) {

		return resul >= NOTA_MINIMA;
	}

}
