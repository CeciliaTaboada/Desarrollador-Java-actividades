package clasetresactividades;

public class ejercicio1 {

	public static void main(String[] args) {
		// Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
		
		String trabalengua = "tres tristes tigres comen trigo en un trigal";
		int cant_apariciones = 0;
		for(int i = 0; i < trabalengua.length(); i++ ) {
			char letra = trabalengua.charAt(i);
			if (letra == 't') {
				cant_apariciones++;
			}
		}
		System.out.println(cant_apariciones);
	}

}
