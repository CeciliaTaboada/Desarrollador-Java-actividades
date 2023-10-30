package claseseis;

import java.util.Scanner;

public class pruebaObras {

	public static void main(String[] args) {
		
		String tituloDeLibro;
		String autordelLibro;
		int numeroDePaginas;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el titulo del libro: ");
		tituloDeLibro = teclado.nextLine();
		
		System.out.println("Introduzca el autor del libro: ");
		autordelLibro = teclado.nextLine();
		
		System.out.println("Introduzca la cantidad de paginas: ");
		numeroDePaginas = teclado.nextInt();
		
		Libro libro1 = new Libro(tituloDeLibro, autordelLibro, numeroDePaginas);
		Cuadro cuadro = new Cuadro("titulo cuadro", "autor", 12, 12);
		
		System.out.println(libro1.getAtributos());
		System.out.println(cuadro.getAtributos());
	}

}
