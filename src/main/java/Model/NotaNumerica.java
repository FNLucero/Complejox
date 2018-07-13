package Model;

public class NotaNumerica implements TipoNota {
	
	int resultado;
	private static final int NOTA_MINIMA = 6;
	
	@Override
	public boolean estaAprobada() {
		return this.resultado >= NOTA_MINIMA;
	}

}
