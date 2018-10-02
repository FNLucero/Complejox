package Model;

public enum Conceptos {
	M("M"), R("R"), B("B"), MB("MB"), S("S");

	private String nota;

	private Conceptos(String nota) {
		this.nota = nota;
	}
	
	public static boolean aprobado(String nota)
	{
		return Conceptos.valueOf(nota).ordinal() >= B.ordinal();
	}
	
}
