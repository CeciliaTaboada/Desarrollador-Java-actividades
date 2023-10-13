package clasetresactividades;

public class ejercicio4 {

	public static void main(String[] args) {
		// Genere una clase que tenga los métodos para 
		//realizar la codificación y decodificación
		//de un string, dado un número de desplazamiento.
		String unString = "hola que tal";
		byte[] decodedBytes = unString.getBytes();
		
		for(int i = 0; i < decodedBytes.length; i++ ) {
			decodedBytes[i]++;
		}
		System.out.println(new String(decodedBytes));
	}

}
