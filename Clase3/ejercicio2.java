package clasetresactividades;

import java.util.Arrays;
import java.util.Collections;

public class ejercicio2 {

	public static void main(String[] args) {
		// Dados 3 números y un orden (ascendente o decreciente) 
		// que ordene los mismos y los retorne en un vector de 3
		
		
		Integer numeros[] = {1,2,3};
		boolean ascendente = false;
		
		if (ascendente) {
			Arrays.sort(numeros);
		}else {
			Arrays.sort(numeros, Collections.reverseOrder());
		}
		
		for (int elemento: numeros) {
			System.out.println(elemento);
		}
	}

}
