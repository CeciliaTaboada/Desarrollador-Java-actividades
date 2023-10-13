package clasetresactividades;

public class ejercicioscuestionario {

	public static void main(String[] args) {
		char letras[] = {'a','b','c','d'};

		int numeros[] = new int[]{1,37,16};

		for(int i=0;i<numeros.length;i++){

		if (numeros[i] < 30) {

		System.out.println(letras[i+1]);

		} else {

		System.out.println(numeros[i]);

		}

		}
		String frase = "hola que tal?";
		frase.toUpperCase().replace("hola","chau");
		
		System.out.println(frase.toUpperCase().replace("hola","chau"));
		
		String[] separado = "3_tristes tigres_del_13".split("_");
		System.out.println(separado.length);
		for(String letra: separado){
		System.out.println(letra);

	}

}
}
