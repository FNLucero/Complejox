package Model;

public class NotaNumerica implements TipoNota {
	
	int resultado;
	private static final int NOTA_MINIMA = 6;
	
	
	
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}




	@Override
	public boolean estaAprobada() {
		return this.resultado >= NOTA_MINIMA;
	}




	public int getResultado() {
		return resultado;
	}

}
