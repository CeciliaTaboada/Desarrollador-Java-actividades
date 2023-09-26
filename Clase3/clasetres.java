package clasetresactividades;

public class clasetres {
	
	//Primer aproximación a los arrays en Java

	public static void main(String[] args) {
		// Lado izq: declaramos el array
		// Lado der: se crea el array o asignamos valores
		
		int numeros[] = new int[3];
		
		//Agregamos los numeros a las posiciones del array
		
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=32;
		
		//Prueba del valor almacenado
		System.out.println(numeros[2]);
		
		//Otra forma de asignar valores a un array:
		
		int numeros2[] = {1, 23, 32, 40};
		
		numeros2[1]=10;
		
		System.out.println(numeros2[1]);
		
		//Los arrays en Java son estáticos, no permiten agregar valores una vez que se definieron cuantos valores va a tener
		// otra forma de declarar arrays:
		
		int numeros3[] = new int[] {1,23,32,40};
		
		System.out.println("Cantidad de elementos que tiene el array numeros2: "+ numeros2.length);
		
		
		//Para imprimir un array completo:
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("El elemento en la posicion "+(i+1)+" es "+numeros[i]);	
		}
		//otra forma:
		
		for(int num : numeros2) {
			System.out.println(num);
		}
		
		//Array de letras
		
		char letras[] = {'a','e','i','o','u'};
		
		for(char letra: letras) {
			System.out.println(letra);
		}
	}

}
