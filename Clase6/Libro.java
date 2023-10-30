package claseseis;

public class Libro extends Obra {
	
	private int numeroPaginas;
	
	public Libro(String titulo, String autor, int numeroPaginas) {
		super(titulo, autor);
		this.setNumeroPaginas(numeroPaginas);
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getAtributos() {
		return super.getAtributos()+"\nEl libro tiene "+ numeroPaginas+" paginas";
	}

}
