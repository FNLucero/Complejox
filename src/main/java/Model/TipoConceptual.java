package Model;
import Model.TipoNota;

public class TipoConceptual implements TipoNota {
	
	int resultado;
	public TipoConceptual() {
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public boolean estaAprobada() {
		return this.resultado >= Conceptos.B.ordinal();
	}
}
