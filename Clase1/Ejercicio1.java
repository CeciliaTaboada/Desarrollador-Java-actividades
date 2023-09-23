package claseunoactividades;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”
		int a = 5;
		int b = 14;
		
		int cond = a;
		while(cond <= b) {
			System.out.println(cond);
			cond++;
		}
		
		//b. A lo anterior, solo muestre los números pares
		
		while(cond <= b) {
			if(cond % 2 == 0) {
				System.out.println(cond);}
			cond++;
		}
		
		// c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Ingrese 0 si desea ver números pares o 1 si desea impares: ");
		int parImpar = obj.nextInt();
		System.out.println("Ha ingresado: "+parImpar);
		while(cond <= b) {
			if(parImpar == 0 && cond % 2 == 0) {
				System.out.println(cond);}
			if(parImpar == 1 && cond % 2 !=0) {
				System.out.println(cond);
			}
			cond++;
		}
	
		
		//d.Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		
		for(int cond2 = b ; cond2 >= a ; cond2--) {
			if(cond2 % 2 ==0) {
				System.out.println(cond2);}
		}		
		}
	}


