package Model;

public enum Conceptos {
	M("M"), R("R"), B("B"), MB("MB"), S("S");

	private String nota;

	private Conceptos(String nota) {
		this.nota = nota;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

}
