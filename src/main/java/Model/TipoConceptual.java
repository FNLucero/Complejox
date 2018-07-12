package Model;
import Model.TipoNota;

public class TipoConceptual implements TipoNota {
	
	@Override
	public boolean estaAprobada(int resul) {
		return resul >= Conceptos.B.ordinal();
	}

}
