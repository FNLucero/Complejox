package Model;
import Model.TipoNota;

public class TipoConceptual implements TipoNota {
	
	String resultado;
	public TipoConceptual() {
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String getResultado() {
		return resultado ;
	}
	
	@Override
	public boolean estaAprobada() {
		return Conceptos.aprobado(this.resultado);
	}


	
}
