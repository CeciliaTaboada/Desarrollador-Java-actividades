package clasetresactividades;

public class ejercicio3 {

	public static void main(String[] args) {
		// dado un vector de números, y un número X, 
		//que sume todos los números > X y retorne el resultado
		
		int vectorNumeros[]= {10,20,30,40,50,60};
		int sumaDeNumeros = 0;
		int x = 15;
		for(int num: vectorNumeros) {
			if(num > x) {
				sumaDeNumeros+= num;
			}
		}
		System.out.println("La sumatoria de numeros mayores a "+x+" es "+sumaDeNumeros);
	}

}
