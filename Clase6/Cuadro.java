package claseseis;

public class Cuadro extends Obra{
	
	private int largo;
	private int alto;
	
	public Cuadro(String titulo, String autor, int largo, int alto) {
		super(titulo, autor);
		this.setLargo(largo);
		this.setAlto(alto);
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public String getAtributos() {
		return super.getAtributos()+"\nEl cuadro mide "+largo+" x "+alto;
	}

}
