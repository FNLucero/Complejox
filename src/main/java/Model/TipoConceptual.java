package Model;
import Model.TipoNota;

public class TipoConceptual implements TipoNota {
	
	int resultado;
	public TipoConceptual() {
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int getResultado() {
		return resultado ;
	}
	
	@Override
	public boolean estaAprobada() {
		return this.resultado >= Conceptos.B.ordinal();
	}
}
