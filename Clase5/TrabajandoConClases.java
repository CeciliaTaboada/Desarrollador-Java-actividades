package clasecincoactividades;

public class TrabajandoConClases {

	public static void main(String[] args) {
		// Crear dos personas
		Persona persona1 = new Persona("Mariana", "Gonzalez");
		
		System.out.println(persona1.toString());
		
		Persona persona2 = new Persona();
		persona2.setNombre("Pedro");
		persona2.setApellido("Martinez");
		
		System.out.println(persona2.getApellido()+", "+persona2.getNombre());
		
		//Crear dos productos
		
		Producto prod1 = new Producto("cepillo de dientes");
		prod1.setNombre("cepillo de dientes");
		prod1.setCodigo("1234556");
		
		
	}

}
