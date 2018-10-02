package Model;

public class NotaNumerica implements TipoNota {
	
	String resultado;
	private static final int NOTA_MINIMA = 6;
	
	
	
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getResultado() {
		return resultado ;
	}


	@Override
	public boolean estaAprobada() {
		return Integer.parseInt(this.resultado) >= NOTA_MINIMA;
	}






}
